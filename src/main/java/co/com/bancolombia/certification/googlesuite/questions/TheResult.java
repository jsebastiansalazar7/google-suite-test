package co.com.bancolombia.certification.googlesuite.questions;

import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleTranslatePage.TARGET_LANGUAGE_RESULT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TARGET_LANGUAGE_RESULT).viewedBy(actor).asString();
	}

	public static TheResult is() {
		return new TheResult();
	}

}
