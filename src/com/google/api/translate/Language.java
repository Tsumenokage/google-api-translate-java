/**
 * Language.java
 *
 * Copyright (C) 2007,  Richard Midwinter
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.google.api.translate;

/**
 * Defines language information for the Google Translate API.
 *
 * @author Richard Midwinter
 * @author alosii
 * @author bjkuczynski
 */
public enum Language {
	AUTO_DETECT(""),
	AFRIKAANS("af"),
	ALBANIAN("sq"),
	AMHARIC("am"),
	ARABIC("ar"),
	ARMENIAN("hy"),
	AZERBAIJANI("az"),
	BASQUE("eu"),
	BELARUSIAN("be"),
	BENGALI("bn"),
	BIHARI("bh"),
	BULGARIAN("bg"),
	BURMESE("my"),
	CATALAN("ca"),
	CHEROKEE("chr"),
	CHINESE("zh"),
	CHINESE_SIMPLIFIED("zh-CN"),
	CHINESE_TRADITIONAL("zh-TW"),
	CROATIAN("hr"),
	CZECH("cs"),
	DANISH("da"),
	DHIVEHI("dv"),
	DUTCH("nl"),
	ENGLISH("en"),
	ESPERANTO("eo"),
	ESTONIAN("et"),
	FILIPINO("tl"),
	FINNISH("fi"),
	FRENCH("fr"),
	GALACIAN("gl"),
	GEORGIAN("ka"),
	GERMAN("de"),
	GREEK("el"),
	GUARANI("gn"),
	GUJARATI("gu"),
	HEBREW("iw"),
	HINDI("hi"),
	HUNGARIAN("hu"),
	ICELANDIC("is"),
	INDONESIAN("id"),
	INUKTITUT("iu"),
	IRISH("ga"),
	ITALIAN("it"),
	JAPANESE("ja"),
	KANNADA("kn"),
	KAZAKH("kk"),
	KHMER("km"),
	KOREAN("ko"),
	KURDISH("ku"),
	KYRGYZ("ky"),
	LAOTHIAN("lo"),
	LATVIAN("lv"),
	LITHUANIAN("lt"),
	MACEDONIAN("mk"),
	MALAY("ms"),
	MALAYALAM("ml"),
	MALTESE("mt"),
	MARATHI("mr"),
	MONGOLIAN("mn"),
	NEPALI("ne"),
	NORWEGIAN("no"),
	ORIYA("or"),
	PASHTO("ps"),
	PERSIAN("fa"),
	POLISH("pl"),
	PORTUGUESE("pt"),
	PUNJABI("pa"),
	ROMANIAN("ro"),
	RUSSIAN("ru"),
	SANSKRIT("sa"),
	SERBIAN("sr"),
	SINDHI("sd"),
	SINHALESE("si"),
	SLOVAK("sk"),
	SLOVENIAN("sl"),
	SPANISH("es"),
	SWAHILI("sw"),
	SWEDISH("sv"),
	TAJIK("tg"),
	TAMIL("ta"),
	TAGALOG("tl"),
	TELUGU("te"),
	THAI("th"),
	TIBETAN("bo"),
	TURKISH("tr"),
	UKRANIAN("uk"),
	URDU("ur"),
	UZBEK("uz"),
	UIGHUR("ug"),
	VIETNAMESE("vi"),
	WELSH("cy"),
	YIDDISH("yi");
	
	/**
	 * Google's String representation of this language.
	 */
	private final String language;
	
	/**
	 * Enum constructor.
	 * @param pLanguage The language identifier.
	 */
	private Language(final String pLanguage) {
		language = pLanguage;
	}
	
	public static Language fromString(final String pLanguage) {
		for (Language l : values()) {
			if (pLanguage.equals(l.toString())) {
				return l;
			}
		}
		return null;
	}
	
	/**
	 * Returns the String representation of this language.
	 * @return The String representation of this language.
	 */
	@Override
	public String toString() {
		return language;
	}
}