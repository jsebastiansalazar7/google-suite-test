package co.com.bancolombia.certification.googlesuite.tasks;

import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA;
import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleTranslatePage.TRANSLATE;

import co.com.bancolombia.certification.googlesuite.model.language.SelectLanguage;
import co.com.bancolombia.certification.googlesuite.model.translate.TranslationExpression;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class TranslateTheExpression implements Task {
	
	private TranslationExpression translationExpression;

	public TranslateTheExpression(TranslationExpression translationExpression) {
		this.translationExpression = translationExpression;
	}

	@Override
	@Step("{0} attempts to translate the #translateExpression")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(SelectLanguage.theSourceLanguage().called(translationExpression.getSourceLanguage()),
				SelectLanguage.theTargetLanguage().called(translationExpression.getTargetLanguage()),
				Enter.theValue(translationExpression.getWord()).into(SOURCE_LANGUAGE_TEXTAREA),
				Click.on(TRANSLATE));
	}

}
