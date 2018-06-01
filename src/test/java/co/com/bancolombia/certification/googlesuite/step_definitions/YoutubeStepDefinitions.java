package co.com.bancolombia.certification.googlesuite.step_definitions;

import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleAppsComponent.YOUTUBE;
import static co.com.bancolombia.certification.googlesuite.user_interface.Webpage.GOOGLE_HOME_PAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.greaterThan;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.questions.TheVideoResults;
import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class YoutubeStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor mike = Actor.named("Mike");
	
	@Before
	public void setUp() {
		mike.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Mike wants to watch a video$")
	public void thatMikeWantsToWatchAVideo() throws Exception {
		mike.wasAbleTo(OpenTheBrowser.at(GOOGLE_HOME_PAGE),
				GoTo.theApp(YOUTUBE));
	}

	@When("^he searches the video (.*)$")
	public void heSearchesTheVideoBeethovenSymphonyHubbleImages(String video) throws Exception {
		mike.attemptsTo(Search.the(video));
	}

	@Then("^he should see at least (\\d+) video listed$")
	public void heShouldSeeAtLeastVideoListed(int arg1) throws Exception {
		mike.should(seeThat(TheVideoResults.are(), greaterThan(0)));
	}

}
