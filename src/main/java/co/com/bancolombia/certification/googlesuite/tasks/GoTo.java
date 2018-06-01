package co.com.bancolombia.certification.googlesuite.tasks;

import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleAppsComponent.GOOGLE_APPS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class GoTo implements Task {
	
	private Target googleApp;
	
	public GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}

	@Override
	@Step("{0} goes to #googleApp")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GOOGLE_APPS),
				Click.on(googleApp));
	}

	public static GoTo theApp(Target googleApp) {
		return instrumented(GoTo.class, googleApp);
	}

}
