package BasicExamples;

public class IndianTranslator implements Itranslator {
	
	public void listen() {
		System.out.print("Listen to Mr. President");
	}
	
	public LanguageTranslate translate() {
		return new LanguageTranslate("English","Hindi");
	}
	
	public WriteNotes writeNotes() {
		WriteNotes wn = new WriteNotes();
		wn.setConvEnglish("Convert English");
		wn.setConvHindi("Translate in English");
		
		return wn;
		
	}
	

}
