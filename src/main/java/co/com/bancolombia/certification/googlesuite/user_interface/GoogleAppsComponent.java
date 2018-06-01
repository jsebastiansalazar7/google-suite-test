package co.com.bancolombia.certification.googlesuite.user_interface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Google Apps Button").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Google Translate Option").located(By.id("gb51"));
	public static final Target YOUTUBE = Target.the("Youtube Option").located(By.id("gb36"));

}
