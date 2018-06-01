package co.com.bancolombia.certification.googlesuite.model.language;

import co.com.bancolombia.certification.googlesuite.model.LanguageBuilder;
import co.com.bancolombia.certification.googlesuite.user_interface.GoogleTranslatePage;

public class SelectLanguage {
	
	public static LanguageBuilder theSourceLanguage() {
		return new LanguageBuilder(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION);
	}
	
	public static LanguageBuilder theTargetLanguage() {
		return new LanguageBuilder(GoogleTranslatePage.TARGET_LANGUAGE_OPTION);
	}

}
