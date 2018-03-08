package MC;
// Import HashMap
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.Map;

public class MorseCode {
//Created HAshMap
	static Map <String,String> morseToLetter = new HashMap <String, String>();
	
	
	//HashMap mapping Morse to Letter
	public static void morseToLetterConverter () {
		
		morseToLetter.put(".-", "A");
		morseToLetter.put("-...","B");
		morseToLetter.put("-.-.","C");
		morseToLetter.put("-..","D");
		morseToLetter.put(".","E");
		morseToLetter.put("..-.","F");
		morseToLetter.put("--.","G");
		morseToLetter.put("....","H");
		morseToLetter.put("..","I");
		morseToLetter.put(".---","J");
		morseToLetter.put("-.-","K");
		morseToLetter.put(".-..","L");
		morseToLetter.put("--","M");
		morseToLetter.put("-.","N");
		morseToLetter.put("---","O");
		morseToLetter.put(".--.","P");
		morseToLetter.put("--.-","Q");
		morseToLetter.put(".-.","R");
		morseToLetter.put("...","S");
		morseToLetter.put("-","T");
		morseToLetter.put("..-","U");
		morseToLetter.put("...-", "V");
		morseToLetter.put(".--","W");
		morseToLetter.put("-..-","X");
		morseToLetter.put("-.--","Y");
		morseToLetter.put("--..", "Z");
		morseToLetter.put("/"," ");
	}
	
	public static String getLetter(String morse) {	//Converts morse sequence to letter
		String a = morseToLetter.get(morse);
		return a;
	}
		
	public static void getSentence(String morse) {
		morseToLetterConverter();
		
		String morseDotsDashes = "";
		String morsePhrase = "";
		//Converts a string to an array of characters
		char[] chars = morse.toCharArray();
		//Iterating over our new array
		for (int i = 0; i<chars.length; i++) {
			//A space indicates a new letter , after which the collated morse characters are pushed through to the getSentence Function
			if (chars[i] == ' ') {
				String AZletter = getLetter(morseDotsDashes);
				morsePhrase = morsePhrase + AZletter; //Add Letter to output to build the Sentence
				AZletter = "";				//Once we've created the Letter we reset the Letter to
				morseDotsDashes = "";		//Resets morse
			}
			if (i == (chars.length) - 1) {
				String AZLetter = getLetter(morseDotsDashes);
				morsePhrase = morsePhrase + AZLetter;
				AZLetter = "";
				morseDotsDashes = "";
			}
			if (chars[i] != ' ') {
			morseDotsDashes = morseDotsDashes + chars[i];
			}
		}
		System.out.println(morsePhrase);
	}
}

