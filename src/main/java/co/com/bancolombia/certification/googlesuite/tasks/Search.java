package co.com.bancolombia.certification.googlesuite.tasks;

import static co.com.bancolombia.certification.googlesuite.user_interface.YoutubePage.SEARCH;
import static co.com.bancolombia.certification.googlesuite.user_interface.YoutubePage.SEARCH_INPUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;;

public class Search implements Task {
	
	private String video;
	
	public Search(String video) {
		this.video = video;
	}

	@Override
	@Step("{0} searches the video #video")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(video).into(SEARCH_INPUT),
				Click.on(SEARCH));
	}

	public static Search the(String video) {
		return instrumented(Search.class, video);
	}

}
