/* LocaleInformation_te.java --
   Copyright (C) 2004  Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


// This file was automatically generated by gnu.localegen from LDML

package gnu.java.locale;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.ListResourceBundle;

public class LocaleInformation_te extends ListResourceBundle
{
  private static final String currenciesDisplayNameKeys = "";

  private static final String currenciesDisplayNameValues = "";

  private static final Hashtable currenciesDisplayName;
  static
  {
    currenciesDisplayName = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesDisplayNameKeys, "|");
    Enumeration values = new StringTokenizer(currenciesDisplayNameValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesDisplayName.put(key, value);
      }
  }

  private static final String currenciesSymbolKeys = "INR";

  private static final String currenciesSymbolValues = "\u0c30\u0c42.";

  private static final Hashtable currenciesSymbol;
  static
  {
    currenciesSymbol = new Hashtable();
    Enumeration keys = new StringTokenizer(currenciesSymbolKeys, "|");
    Enumeration values = new StringTokenizer(currenciesSymbolValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         currenciesSymbol.put(key, value);
      }
  }

  private static final String[] shortMonths = {
    "\u0c1c\u0c28\u0c35\u0c30\u0c3f",
    "\u0c2b\u0c3f\u0c2c\u0c4d\u0c30\u0c35\u0c30\u0c3f",
    "\u0c2e\u0c3e\u0c30\u0c4d\u0c1a\u0c3f",
    "\u0c0f\u0c2a\u0c4d\u0c30\u0c3f\u0c32\u0c4d",
    "\u0c2e\u0c47",
    "\u0c1c\u0c42\u0c28\u0c4d",
    "\u0c1c\u0c42\u0c32\u0c48",
    "\u0c06\u0c17\u0c38\u0c4d\u0c1f\u0c41",
    "\u0c38\u0c46\u0c2a\u0c4d\u0c1f\u0c46\u0c02\u0c2c\u0c30\u0c4d",
    "\u0c05\u0c15\u0c4d\u0c1f\u0c4b\u0c2c\u0c30\u0c4d",
    "\u0c28\u0c35\u0c02\u0c2c\u0c30\u0c4d",
    "\u0c21\u0c3f\u0c38\u0c46\u0c02\u0c2c\u0c30\u0c4d",
    null,
  };

  private static final String[] months = {
    "\u0c1c\u0c28\u0c35\u0c30\u0c3f",
    "\u0c2b\u0c3f\u0c2c\u0c4d\u0c30\u0c35\u0c30\u0c3f",
    "\u0c2e\u0c3e\u0c30\u0c4d\u0c1a\u0c3f",
    "\u0c0f\u0c2a\u0c4d\u0c30\u0c3f\u0c32\u0c4d",
    "\u0c2e\u0c47",
    "\u0c1c\u0c42\u0c28\u0c4d",
    "\u0c1c\u0c42\u0c32\u0c48",
    "\u0c06\u0c17\u0c38\u0c4d\u0c1f\u0c41",
    "\u0c38\u0c46\u0c2a\u0c4d\u0c1f\u0c46\u0c02\u0c2c\u0c30\u0c4d",
    "\u0c05\u0c15\u0c4d\u0c1f\u0c4b\u0c2c\u0c30\u0c4d",
    "\u0c28\u0c35\u0c02\u0c2c\u0c30\u0c4d",
    "\u0c21\u0c3f\u0c38\u0c46\u0c02\u0c2c\u0c30\u0c4d",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "\u0c06\u0c26\u0c3f",
    "\u0c38\u0c4b\u0c2e",
    "\u0c2e\u0c02\u0c17\u0c33",
    "\u0c2c\u0c41\u0c27",
    "\u0c17\u0c41\u0c30\u0c41",
    "\u0c36\u0c41\u0c15\u0c4d\u0c30",
    "\u0c36\u0c28\u0c3f",
  };

  private static final String[] weekdays = {
    null,
    "\u0c06\u0c26\u0c3f\u0c35\u0c3e\u0c30\u0c02",
    "\u0c38\u0c4b\u0c2e\u0c35\u0c3e\u0c30\u0c02",
    "\u0c2e\u0c02\u0c17\u0c33\u0c35\u0c3e\u0c30\u0c02",
    "\u0c2c\u0c41\u0c27\u0c35\u0c3e\u0c30\u0c02",
    "\u0c17\u0c41\u0c30\u0c41\u0c35\u0c3e\u0c30\u0c02",
    "\u0c36\u0c41\u0c15\u0c4d\u0c30\u0c35\u0c3e\u0c30\u0c02",
    "\u0c36\u0c28\u0c3f\u0c35\u0c3e\u0c30\u0c02",
  };

  private static final String[] ampms = {
    "\u0c2a\u0c42\u0c30\u0c4d\u0c35\u0c3e\u0c39\u0c4d\u0c28",
    "\u0c05\u0c2a\u0c30\u0c3e\u0c39\u0c4d\u0c28",
  };

  private static final String territoriesKeys = "IN";

  private static final String territoriesValues = "\u0c2d\u0c3e\u0c30\u0c24 \u0c26\u0c47\u0c33\u0c66";

  private static final Hashtable territories;
  static
  {
    territories = new Hashtable();
    Enumeration keys = new StringTokenizer(territoriesKeys, "|");
    Enumeration values = new StringTokenizer(territoriesValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         territories.put(key, value);
      }
  }

  private static final String languagesKeys = "te";

  private static final String languagesValues = "\u0c24\u0c46\u0c32\u0c41\u0c17\u0c41";

  private static final Hashtable languages;
  static
  {
    languages = new Hashtable();
    Enumeration keys = new StringTokenizer(languagesKeys, "|");
    Enumeration values = new StringTokenizer(languagesValues, "|");
    while (keys.hasMoreElements())
      {
         String key = (String) keys.nextElement();
         String value = (String) values.nextElement();
         languages.put(key, value);
      }
  }

  private static final Object[][] contents =
  {
    { "zeroDigit", "\u0c66" },
    { "currenciesDisplayName", currenciesDisplayName },
    { "currenciesSymbol", currenciesSymbol },
    { "shortMonths", shortMonths },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "ampms", ampms },
    { "territories", territories },
    { "languages", languages },
  };

  public Object[][] getContents() { return contents; }
}
