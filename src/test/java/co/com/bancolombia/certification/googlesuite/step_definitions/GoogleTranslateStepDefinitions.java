package co.com.bancolombia.certification.googlesuite.step_definitions;

import static co.com.bancolombia.certification.googlesuite.user_interface.GoogleAppsComponent.GOOGLE_TRANSLATE;
import static co.com.bancolombia.certification.googlesuite.user_interface.Webpage.GOOGLE_HOME_PAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.model.translate.Translate;
import co.com.bancolombia.certification.googlesuite.questions.TheResult;
import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("Susan");
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	
	@Given("^that Susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		susan.wasAbleTo(OpenTheBrowser.at(GOOGLE_HOME_PAGE),
				GoTo.theApp(GOOGLE_TRANSLATE));
	}


	@When("^she translates the word (.*) from (.*) to (.*)$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish(String word, String sourceLanguage, String targetLanguage) throws Exception {
		susan.attemptsTo(Translate.theExpressionDefinedBy().the(word).from(sourceLanguage).to(targetLanguage));
	}

	@Then("^she should see the word (.*) in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen(String expectedWord) throws Exception {
		susan.should(seeThat(TheResult.is(), equalTo(expectedWord)));
	}

}
