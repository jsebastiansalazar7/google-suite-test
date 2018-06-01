package co.com.bancolombia.certification.googlesuite.model;

import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleTranslatePage.SOURCE_LANGUAGE;
import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleTranslatePage.SOURCE_LANGUAGE_OPTION;
import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleTranslatePage.TARGET_LANGUAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.interactions.SelectTheLanguage;
import net.serenitybdd.screenplay.targets.Target;

public class LanguageBuilder {
	
	private Target languageOption;
	
	public LanguageBuilder(Target languageOption) {
		this.languageOption = languageOption;
	}
	
	public SelectTheLanguage called(String language) {
		Target languageTarget = 
				languageOption.toString().equals(SOURCE_LANGUAGE_OPTION.getName()) ? SOURCE_LANGUAGE.of(language): TARGET_LANGUAGE.of(language);
		return instrumented(SelectTheLanguage.class, languageOption, languageTarget);
	}

}
