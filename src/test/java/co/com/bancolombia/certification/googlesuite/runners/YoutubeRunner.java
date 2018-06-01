package co.com.bancolombia.certification.googlesuite.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/youtube.feature",
		glue = {"co.com.bancolombia.certification.googlesuite.step_definitions"},
		snippets = SnippetType.CAMELCASE
)
public class YoutubeRunner {

}
