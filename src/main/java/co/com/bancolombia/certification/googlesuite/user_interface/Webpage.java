package co.com.bancolombia.certification.googlesuite.user_interface;

import net.serenitybdd.core.pages.PageObject;

public enum Webpage {
	
	GOOGLE_HOME_PAGE(new GoogleHomePage());
	
	private final PageObject page;
	
	Webpage(PageObject page) {
		this.page = page;
	}
	
	public PageObject page() {
		return page;
	}

}
