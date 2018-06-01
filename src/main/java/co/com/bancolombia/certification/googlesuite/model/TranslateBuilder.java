package co.com.bancolombia.certification.googlesuite.model;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certification.googlesuite.model.translate.TranslationExpression;
import co.com.bancolombia.certification.googlesuite.tasks.TranslateTheExpression;;

public class TranslateBuilder {
	
	private String word;
	private String sourceLanguage;
	
	public TranslateBuilder the(String word) {
		this.word = word;
		return this;
	}
	
	public TranslateBuilder from(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
		return this;
	}
	
	public TranslateTheExpression to(String targetLanguage) {
		return instrumented(TranslateTheExpression.class, new TranslationExpression(word, sourceLanguage, targetLanguage));
	}

}
