package co.com.bancolombia.certification.googlesuite.tasks;

import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleHomePage.POP_UP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.user_interface.Webpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {
	
	private Webpage webpage;
	
	public OpenTheBrowser(Webpage webpage) {
		this.webpage = webpage;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(webpage.page()),
				Click.on(POP_UP));
	}

	public static OpenTheBrowser at(Webpage webpage) {
		return instrumented(OpenTheBrowser.class, webpage);
	}

}
