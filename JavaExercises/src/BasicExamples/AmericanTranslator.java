package BasicExamples;

public class AmericanTranslator implements Itranslator {
	public void listen() {
		System.out.print("Listen to Mr. Modi");
	}

	public LanguageTranslate translate() {
		return new LanguageTranslate("Hindi", "English");
	}

	public WriteNotes writeNotes() {
		WriteNotes wn = new WriteNotes();
		wn.setConvEnglish("Convert Hindi");
		wn.setConvHindi("Translate in Hindi");

		return wn;

	}
}
