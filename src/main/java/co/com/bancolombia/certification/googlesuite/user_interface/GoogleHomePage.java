package co.com.bancolombia.certification.googlesuite.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject {
	
	public static final Target POP_UP = Target.the("Privacy Pop Up").locatedBy("//a[@class='gb_Ba gb_Cd gb_ld']");

}
