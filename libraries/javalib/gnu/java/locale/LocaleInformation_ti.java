/* LocaleInformation_ti.java --
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

public class LocaleInformation_ti extends ListResourceBundle
{
  private static final String[] shortMonths = {
    "\u1303\u1295\u12e9",
    "\u134c\u1265\u1229",
    "\u121b\u122d\u127d",
    "\u12a4\u1355\u1228",
    "\u121c\u12ed",
    "\u1301\u1295",
    "\u1301\u120b\u12ed",
    "\u12a6\u1308\u1235",
    "\u1234\u1355\u1274",
    "\u12a6\u12ad\u1270",
    "\u1296\u126c\u121d",
    "\u12f2\u1234\u121d",
    null,
  };

  private static final String[] months = {
    "\u1303\u1295\u12e9\u12c8\u122a",
    "\u134c\u1265\u1229\u12c8\u122a",
    "\u121b\u122d\u127d",
    "\u12a4\u1355\u1228\u120d",
    "\u121c\u12ed",
    "\u1301\u1295",
    "\u1301\u120b\u12ed",
    "\u12a6\u1308\u1235\u1275",
    "\u1234\u1355\u1274\u121d\u1260\u122d",
    "\u12a6\u12ad\u1270\u12cd\u1260\u122d",
    "\u1296\u126c\u121d\u1260\u122d",
    "\u12f2\u1234\u121d\u1260\u122d",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "\u1230\u1295\u1260",
    "\u1230\u1291\u12ed",
    "\u1220\u1209\u1235",
    "\u1228\u1261\u12d5",
    "\u1283\u1219\u1235",
    "\u12d3\u122d\u1262",
    "\u1240\u12f3\u121d",
  };

  private static final String[] weekdays = {
    null,
    "\u1230\u1295\u1260\u1275",
    "\u1230\u1291\u12ed",
    "\u1220\u1209\u1235",
    "\u1228\u1261\u12d5",
    "\u1283\u1219\u1235",
    "\u12d3\u122d\u1262",
    "\u1240\u12f3\u121d",
  };

  private static final String[] eras = {
    "\u12d3/\u12d3",
    "\u12d3/\u121d",
  };

  private static final String[] ampms = {
    "\u1295\u1309\u1206 \u1230\u12d3\u1270",
    "\u12f5\u1215\u122d \u1230\u12d3\u1275",
  };

  private static final String territoriesKeys = "";

  private static final String territoriesValues = "";

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

  private static final String languagesKeys = "";

  private static final String languagesValues = "";

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
    { "shortMonths", shortMonths },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "eras", eras },
    { "ampms", ampms },
    { "territories", territories },
    { "languages", languages },
  };

  public Object[][] getContents() { return contents; }
}
