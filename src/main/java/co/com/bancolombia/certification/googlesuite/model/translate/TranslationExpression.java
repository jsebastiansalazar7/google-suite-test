package co.com.bancolombia.certification.googlesuite.model.translate;

public class TranslationExpression {
	
	private String word;
	private String sourceLanguage;
	private String targetLanguage;
	
	public TranslationExpression(String word, String sourceLanguage, String targetLanguage) {
		this.word = word;
		this.sourceLanguage = sourceLanguage;
		this.targetLanguage = targetLanguage;
	}

	public String getWord() {
		return word;
	}

	public String getSourceLanguage() {
		return sourceLanguage;
	}

	public String getTargetLanguage() {
		return targetLanguage;
	}

}
