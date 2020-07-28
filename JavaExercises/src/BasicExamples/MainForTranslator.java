package BasicExamples;

public class MainForTranslator {

	public static void main(String[] args) {
		
		Itranslator trans = new IndianTranslator();
		
		System.out.print(trans.translate().getFromLanguage());
		

		

	}

}
