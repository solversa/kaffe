/*
 * Java core library component.
 *
 * Copyright (c) 1997, 1998
 *      Transvirtual Technologies, Inc.  All rights reserved.
 *
 * See the file "license.terms" for information on usage and redistribution
 * of this file.
 */

package java.util;

import java.io.IOException;
import java.io.InputStream;
import kaffe.lang.DummyClassLoader;

public abstract class ResourceBundle {

	protected ResourceBundle parent;
	static Hashtable cache = new Hashtable();
	private Locale locale;

public ResourceBundle() {
	parent = null;
}

public static final ResourceBundle getBundle(String baseName)
		throws MissingResourceException {
	return getBundle(baseName, Locale.getDefault(), null);
}

public static final ResourceBundle getBundle(String baseName, Locale locale)
		throws MissingResourceException {
	return getBundle(baseName, locale, null);
}

public static ResourceBundle getBundle(String baseName, Locale locale,
		ClassLoader loader) throws MissingResourceException {
	String		key = baseName + locale;
	ResourceBundle	ret = (ResourceBundle) cache.get (key);

	if (ret == null) {
		ResourceBundle defaultBundle = getSpecificBundle (baseName, loader);
		if (defaultBundle != null) {
			defaultBundle.parent = null;
			defaultBundle.locale = new Locale ("");
		}

		ret = getBundleWithLocale(baseName, defaultBundle, locale, loader);

		/* It would appear that if we fail to load a resource bundle
		 * for a given locale, we just load the default one instead.
		 */
		if (ret == null && locale != Locale.getDefault()) {
			ret = getBundleWithLocale(baseName, defaultBundle,
			    Locale.getDefault(), loader);
		}

		if (ret != null)  {
			cache.put(key, ret);
		}
	}

	if (ret == null) {
		throw new MissingResourceException("Can't find bundle for base name "
		    + baseName + ",locale " + locale, "ResourceBundle", baseName);
	}

	return (ret);
}

private static final ResourceBundle getBundleWithLocale(String baseName, ResourceBundle bundle,
		Locale locale, ClassLoader loader) {
	ResourceBundle nbundle = null;

	String lang = locale.getLanguage();
	String cntry = locale.getCountry();
	String var = locale.getVariant();

	StringBuffer sb = new StringBuffer(60);
	sb.append (baseName);

	sb.append ('_');
	if (lang.length()>0) {
		sb.append (lang);
		nbundle = getSpecificBundle(sb.toString(), loader);
		if (nbundle != null) {
			nbundle.parent = bundle;
			nbundle.locale = new Locale (lang);
			bundle = nbundle;
		}
	}

	sb.append ('_');
	if (cntry.length()>0) {
		sb.append (cntry);	
		nbundle = getSpecificBundle(sb.toString(), loader);
		if (nbundle != null) {
			nbundle.parent = bundle;
			nbundle.locale = new Locale (lang, cntry);
			bundle = nbundle;
		}
	}

	if (var.length()>0) {
		sb.append ('_');
		sb.append (var);
		nbundle = getSpecificBundle(sb.toString(), loader);
		if (nbundle != null) {	
			nbundle.parent = bundle;
			nbundle.locale = new Locale (lang, cntry, var);
			bundle = nbundle;
		}
	}
	
	return (bundle);
}

public Locale getLocale () {
	return locale;
}

public abstract Enumeration getKeys();

public final Object getObject(String key) throws MissingResourceException {
	try {
		Object obj = handleGetObject(key);
		if (obj != null) {
			return (obj);
		}
	}
	catch (MissingResourceException e) {
	}
	if (parent == null) {
		throw new MissingResourceException("resource not found",
		    this.getClass().toString(), key);
	}
	return (parent.getObject(key));
}

private static final ResourceBundle getSpecificBundle(String baseName,
		ClassLoader loader) {

	// baseName = baseName.replace('.', '/');
	if (loader == null)
		loader = DummyClassLoader.getCurrentClassLoader();
	try {
		// Class cls = Class.forName(baseName);
		Class cls = loader.loadClass(baseName);
		/* 
		 * Only call newInstance if the cast to resource bundle 
		 * will indeed succeed.
		 */
		if (ResourceBundle.class.isAssignableFrom(cls)) {
			return ((ResourceBundle)cls.newInstance());
		}
	}
	catch (Exception _) {
	}

	// Okay, failed to load bundle - attempt to load properties as bundle.
	InputStream strm;
	strm = loader.getResourceAsStream(baseName.replace('.', '/')
	    + ".properties");
	if (strm != null) {
		try {
			return (new PropertyResourceBundle(strm));
		}
		catch (IOException _) {
		}
	}
	return null;
}

public final String getString(String key) throws MissingResourceException {
	return ((String)getObject(key));
}

public final String[] getStringArray(String key)
		throws MissingResourceException {
	return ((String[])getObject(key));
}

protected abstract Object handleGetObject(String key)
	throws MissingResourceException;

protected void setParent(ResourceBundle par) {
	parent = par;
}
}
