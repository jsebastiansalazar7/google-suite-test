package co.com.bancolombia.certification.googlesuite.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTheLanguage implements Interaction {
	
	private Target languageOption;
	private Target language;
	
	public SelectTheLanguage(Target languageOption, Target language) {
		this.languageOption = languageOption;
		this.language = language;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(languageOption));
		actor.attemptsTo(Click.on(language));
	}

}
