/* LocaleInformation_gu.java --
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

public class LocaleInformation_gu extends ListResourceBundle
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

  private static final String currenciesSymbolValues = "\u0ab0\u0ac1";

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
    "\u0a9c\u0abe\u0aa8\u0acd\u0aaf\u0ac1",
    "\u0aab\u0ac7\u0aac\u0acd\u0ab0\u0ac1",
    "\u0aae\u0abe\u0ab0\u0acd\u0a9a",
    "\u0a8f\u0aaa\u0acd\u0ab0\u0abf\u0ab2",
    "\u0aae\u0ac7",
    "\u0a9c\u0ac2\u0aa8",
    "\u0a9c\u0ac1\u0ab2\u0abe\u0a88",
    "\u0a91\u0a97\u0ab8\u0acd\u0a9f",
    "\u0ab8\u0aaa\u0acd\u0a9f\u0ac7",
    "\u0a91\u0a95\u0acd\u0a9f\u0acb",
    "\u0aa8\u0ab5\u0ac7",
    "\u0aa1\u0abf\u0ab8\u0ac7",
    null,
  };

  private static final String[] months = {
    "\u0a9c\u0abe\u0aa8\u0acd\u0aaf\u0ac1\u0a86\u0ab0\u0ac0",
    "\u0aab\u0ac7\u0aac\u0acd\u0ab0\u0ac1\u0a86\u0ab0\u0ac0",
    "\u0aae\u0abe\u0ab0\u0acd\u0a9a",
    "\u0a8f\u0aaa\u0acd\u0ab0\u0abf\u0ab2",
    "\u0aae\u0ac7",
    "\u0a9c\u0ac2\u0aa8",
    "\u0a9c\u0ac1\u0ab2\u0abe\u0a88",
    "\u0a91\u0a97\u0ab8\u0acd\u0a9f",
    "\u0ab8\u0aaa\u0acd\u0a9f\u0ac7\u0aae\u0acd\u0aac\u0ab0",
    "\u0a91\u0a95\u0acd\u0a9f\u0acd\u0aac\u0ab0",
    "\u0aa8\u0ab5\u0ac7\u0aae\u0acd\u0aac\u0ab0",
    "\u0aa1\u0abf\u0ab8\u0ac7\u0aae\u0acd\u0aac\u0ab0",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "\u0ab0\u0ab5\u0abf",
    "\u0ab8\u0acb\u0aae",
    "\u0aae\u0a82\u0a97\u0ab3",
    "\u0aac\u0ac1\u0aa7",
    "\u0a97\u0ac1\u0ab0\u0ac1",
    "\u0ab6\u0ac1\u0a95\u0acd\u0ab0",
    "\u0ab6\u0aa8\u0abf",
  };

  private static final String[] weekdays = {
    null,
    "\u0ab0\u0ab5\u0abf\u0ab5\u0abe\u0ab0",
    "\u0ab8\u0acb\u0aae\u0ab5\u0abe\u0ab0",
    "\u0aae\u0a82\u0a97\u0ab3\u0ab5\u0abe\u0ab0",
    "\u0aac\u0ac1\u0aa7\u0ab5\u0abe\u0ab0",
    "\u0a97\u0ac1\u0ab0\u0ac1\u0ab5\u0abe\u0ab0",
    "\u0ab6\u0ac1\u0a95\u0acd\u0ab0\u0ab5\u0abe\u0ab0",
    "\u0ab6\u0aa8\u0abf\u0ab5\u0abe\u0ab0",
  };

  private static final String[] ampms = {
    "\u0aaa\u0ac2\u0ab0\u0acd\u0ab5\u00a0\u0aae\u0aa7\u0acd\u0aaf\u0abe\u0ab9\u0acd\u0aa8",
    "\u0a89\u0aa4\u0acd\u0aa4\u0ab0\u00a0\u0aae\u0aa7\u0acd\u0aaf\u0abe\u0ab9\u0acd\u0aa8",
  };

  private static final String territoriesKeys = "TR|IN|CN|GE|DE|NP|TM|US|EG|PK";

  private static final String territoriesValues = "\u0aa4\u0ac1\u0ab0\u0acd\u0a95\u0ab8\u0acd\u0aa4\u0abe\u0aa8|\u0aad\u0abe\u0ab0\u0aa4|\u0a9a\u0ac0\u0aa8|\u0a9c\u0acd\u0aaf\u0acb\u0ab0\u0acd\u0a9c\u0ac0\u0aaf\u0abe|\u0a9c\u0aae\u0abf\u0aa8\u0ac0|\u0aa8\u0ac7\u0aaa\u0abe\u0ab3|\u0aa4\u0ac1\u0ab0\u0acd\u0a95\u0acd\u0aae\u0aa8\u0abf\u0ab8\u0acd\u0aa4\u0abe\u0aa8|\u0ab8\u0a82\u0aaf\u0ac1\u0a95\u0aa4 \u0ab0\u0abe\u0a9c\u0acd\u0aaf \u0a85\u0aae\u0ac7\u0ab0\u0abf\u0a95\u0abe|\u0aae\u0abf\u0ab8\u0ab0|\u0a95\u0ab0\u0abe\u0a82\u0a9a\u0ac0";

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

  private static final String languagesKeys = "gu";

  private static final String languagesValues = "\u0a97\u0ac1\u0a9c\u0ab0\u0abe\u0aa4\u0ac0";

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
    { "zeroDigit", "\u0ae6" },
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
