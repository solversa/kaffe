/* LocaleInformation_lt.java --
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

public class LocaleInformation_lt extends ListResourceBundle
{
  private static final String currenciesDisplayNameKeys = "LTL";

  private static final String currenciesDisplayNameValues = "LTL";

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

  private static final String currenciesSymbolKeys = "LTL";

  private static final String currenciesSymbolValues = "Lt";

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
    "Sau",
    "Vas",
    "Kov",
    "Bal",
    "Geg",
    "Bir",
    "Lie",
    "Rgp",
    "Rgs",
    "Spa",
    "Lap",
    "Grd",
    null,
  };

  private static final String[] months = {
    "Sausio",
    "Vasario",
    "Kovo",
    "Baland\u017eio",
    "Gegu\u017e\u0117s",
    "Bir\u017eelio",
    "Liepos",
    "Rugpj\u016b\u010dio",
    "Rugs\u0117jo",
    "Spalio",
    "Lapkri\u010dio",
    "Gruod\u017eio",
    null,
  };

  private static final String[] shortWeekdays = {
    null,
    "Sk",
    "Pr",
    "An",
    "Tr",
    "Kt",
    "Pn",
    "\u0160t",
  };

  private static final String[] weekdays = {
    null,
    "Sekmadienis",
    "Pirmadienis",
    "Antradienis",
    "Tre\u010diadienis",
    "Ketvirtadienis",
    "Penktadienis",
    "\u0160e\u0161tadienis",
  };

  private static final String[] eras = {
    "pr.Kr.",
    "po.Kr.",
  };

  private static final String territoriesKeys = "TL|TK|TJ|TH|TG|TF|GY|TD|TC|GW|GU|GT|GS|GR|GQ|GP|SZ|SY|GN|GM|GL|SV|ST|GI|GH|SR|GF|SP|GE|SO|GD|SN|SM|GB|SL|GA|SK|SJ|SI|SH|SG|SE|SD|SC|SB|SA|FR|FO|FM|RW|FK|RU|FJ|FI|RO|RE|ET|ES|ER|EH|EG|EE|EC|DZ|QA|DO|PY|DM|PW|DK|DJ|PT|PS|PR|DE|PN|PM|PL|PK|PH|PG|PF|CZ|PE|CY|CX|CV|PA|CU|CR|CO|CN|CM|CL|CK|CI|CH|CG|CF|CD|CC|OM|CA|BZ|BY|BW|BV|BT|BS|BR|NZ|BO|BN|BM|NU|BJ|BI|BH|NR|BG|BF|NP|BE|NO|BD|BB|ZW|NL|BA|NI|NG|NF|AZ|NE|NC|AW|ZM|NA|AU|AT|AS|AR|AQ|MZ|AO|MY|AN|MX|AM|MW|AL|MV|ZA|MU|MT|AI|MS|MR|AG|MQ|AF|MP|AE|MO|AD|MN|MM|ML|MK|YU|YT|MH|MG|MD|MC|MA|YE|LY|LV|LU|LT|LS|LR|LK|LI|LC|LB|LA|KZ|KY|KW|KR|KP|KN|KM|KI|WS|KH|KG|KE|WF|JP|JO|JM|VU|VN|VI|VG|VE|VC|VA|IT|IS|IR|IQ|UZ|IO|UY|IN|IL|US|IE|ID|UM|UG|UA|HU|HT|HR|TZ|HN|HM|TW|TV|HK|TT|TR|TO|TN|TM";

  private static final String territoriesValues = "Ryt\u0173 Timoras|Tokelau|Tad\u017eikija|Tailandas|Togas|Pranc\u016bz\u0173 pietin\u0117s teritorijos|Gviana|\u010cadas|Turks ir Kaikos salos|Gvin\u0117ja-Bisau|Guamas|Gvatemala|Ryt\u0173 D\u017eord\u017eija ir Ryt\u0173 Sandwich salos|Graikija|Ekvatorin\u0117 Gvin\u0117ja|Gvadelup\u0117|Svazilendas|Sirija|Gvin\u0117ja|Gambija|Grenlandija|El Salvadoras|San Tom\u0117 ir Princip\u0117|Gibraltaras|Gana|Surinamas|Pranc\u016bzijos Gviana|Serbia|Gruzija|Somalis|Grenada|Senegalas|San Marinas|Did\u017eioji Britanija|Siera Leon\u0117|Gabonas|Slovakia|Svalbardo ir Jan Majen salos|Slov\u0117nija|\u0160ventoji Elena|Singap\u016bras|\u0160vedija|Sudanas|Sei\u0161eliai|Saliamono salos|Saudo Arabija|Pranc\u016bzija|Farer\u0173 salos|Mikronezijos Federacin\u0117s Valstijos|Ruanda|Folklendo salos (Malvinai)|Rusijos Federacija|Fid\u017eis|Suomija|Rumunija|Rejunjonas|Etiopija|Ispanija|Eritr\u0117ja|Vakar\u0173 Sachara|Egiptas|Estija|Ekvadoras|Al\u017eyras|Kataras|Dominikos Respublika|Paragvajus|Dominika|Palau|Danija|D\u017eibutis|Portugalija|Palestinos teritorija|Puerto Rikas|Vokietija|Pitkernas|Sen Pjeras ir Mikelonas|Lenkija|Pakistanas|Filipinai|Papua Naujoji Gvin\u0117ja|Pranc\u016bz\u0173 Polinezija|\u010cekijos respublika|Peru|Kipras|Kal\u0117d\u0173 sala|\u017daliojo Ky\u0161ulio salos|Panama|Kuba|Kosta Rika|Kolumbija|Kinija|Kamer\u016bnas|\u010cil\u0117|Kuko salos|Kot d\u2019Ivuar|\u0160veicarija|Kongas|Centrin\u0117s Afrikos Respublika|Kongo Demokratin\u0117 Respublika|Kokos\u0173 salos|Omanas|Kanada|Belizas|Baltarusija|Botsvana|Bouvet sala|Butanas|Bahamai|Brazilija|Naujoji Zelandija|Bolivija|Brun\u0117jus|Bermudai|Niuj\u0117|Beninas|Burundis|Bahreinas|Nauru|Bulgarija|Burkina Fasas|Nepalas|Belgija|Norvegija|Banglade\u0161as|Barbadosas|Zimbabv\u0117|Nyderlandai|Bosnija ir Hercegovina|Nikaragva|Nigerija|Norfolko sala|Azerbaid\u017eanas|Nigeris|Naujoji Kaledonija|Aruba|Zambija|Namibija|Australija|Austrija|Amerikos Samoa|Argentina|Antarktika|Mozambikas|Angola|Malaizija|Nyderland\u0173 Antilai|Meksika|Arm\u0117nija|Malavis|Albanija|Maldivai|Piet\u0173 Afrika|Mauricijus|Malta|Angvila|Montserat|Mauritanija|Antigva ir Barbuda|Martinika|Afganistanas|\u0160iaurin\u0117s Marianos salos|Jungtiniai Arab\u0173 Emyratai|Kinijos S.A.R. Makao|Andora|Mongolija|Mjanma|Malis|Makedonijos Respublika|Jugoslavija|Majot\u0117|Mar\u0161alo salos|Madagaskaras|Moldovos Respublika|Monakas|Marokas|Jemenas|Libijos Arab\u0173 D\u017eamahirija|Latvija|Liuksemburgas|Lietuva|Lesotas|Liberija|\u0160ri Lanka|Lichten\u0161teinas|\u0160ventoji Liucija|Libanas|Laoso Liaudies Demokratin\u0117 Respublika|Kazachstanas|Kaiman\u0173 salos|Kuveitas|Piet\u0173 Kor\u0117ja|\u0160iaur\u0117s Kor\u0117ja|Sent Kitsas ir Nevis|Komorai|Kiribatis|Samoa|Kambod\u017ea|Kirgiztanas|Kenija|Valiso ir Futuna salos|Japonija|Jordanija|Jamaika|Vanuatu|Vietnamas|JAV Virginijos salos|Brit\u0173 Virginijos salos|Venesuela|\u0160ventasis Vincentas ir Grenadinai|Vatikano Miesto Valstija|Italija|Islandija|Irano|Irakas|Uzbekija|Brit\u0173 Indijos vandenyno teritorija|Urugvajus|Indija|Izraelis|United States|Airija|Indonezija|JAV antraeil\u0117s teritorijos salos|Uganda|Ukraina|Vengrija|Haitis|Kroatija|Tanzanija|Hond\u016bras|Heard ir McDonald salos|Taivanis|Tuvalu|Kinijos S.A.R.Honkongas|Trinidadas ir Tobagas|Turkija|Tonga|Tunisas|Turkm\u0117nistanas";

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

  private static final String languagesKeys = "ja|en|tr|ko|no|el|nl|bg|lv|he|cs|it|lt|fr|zh|ru|ro|fi|ar|sv|pt|pl|sl|sk|de|hu|et|es|hr|da";

  private static final String languagesValues = "Japon\u0173|Angl\u0173|Turk\u0173|Kor\u0117jie\u010di\u0173|Norveg\u0173|Graik\u0173|Oland\u0173|Bulgar\u0173|Latvi\u0173|Hebraj\u0173|\u010cekijos|Ital\u0173|Lietuvi\u0173|Pranc\u016bz\u0173|Kin\u0173|Rus\u0173|Rumun\u0173|Suomi\u0173|Arab\u0173|\u0160ved\u0173|Portugal\u0173|Lenk\u0173|Slov\u0117n\u0173|Slovak\u0173|Vokie\u010di\u0173|Vengr\u0173|Est\u0173|Ispan\u0173|Kroat\u0173|Dan\u0173";

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
    { "decimalSeparator", "," },
    { "groupingSeparator", "." },
    { "localPatternChars", "GanjkHmsSEDFwWxhKzAeugXZ" },
    { "currenciesDisplayName", currenciesDisplayName },
    { "currenciesSymbol", currenciesSymbol },
    { "shortMonths", shortMonths },
    { "months", months },
    { "shortWeekdays", shortWeekdays },
    { "weekdays", weekdays },
    { "eras", eras },
    { "shortDateFormat", "yyyy.MM.dd" },
    { "mediumDateFormat", "yyyy.MM.dd" },
    { "longDateFormat", "yyyy 'm.' MMMM d 'd.'" },
    { "fullDateFormat", "yyyy 'm.' MMMM d 'd.',EEEE" },
    { "territories", territories },
    { "languages", languages },
  };

  public Object[][] getContents() { return contents; }
}
