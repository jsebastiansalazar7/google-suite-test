package co.com.bancolombia.certification.googlesuite.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class YoutubePage {
	
	public static final Target SEARCH_INPUT = Target.the("Search Input Box").locatedBy("//div[@id='search-input']/input");
	public static final Target SEARCH = Target.the("Search Button").located(By.id("search-icon-legacy"));

}
