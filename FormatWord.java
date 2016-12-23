import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Chris Frimming
 * @version 1.0
 * @see  This class returns an array list of the translated phrase. Each word of the original phrase
 * is translated into a pig Latin word based on the rules of translation.  The convert method takes
 * a string value (word) and returns a translated string. 
 */
public class FormatWord implements Displayable {
	private ArrayList<String> lines = new ArrayList<String>();
	
    public FormatWord() {
	}
    /**
     * @see
     * The vowels string contains a constant used to identify specific characters of the string on 
     * which rules are based.  
     * 
     * the method changes the string value to lower case for matching the vowels constants.
     * The word is put into a string builder for the purpose of looking at each character individually.
     * 
     * The for loop examines each character of the string looking for the first vowel.  When the first 
     * vowel is found, the program breaks out of the loop and the index of the first vowel is stored for 
     * rule processing.
     */
	private String convert(String word) {
		String vowels = "aeiou";
        int firstVowel = 0;
        word = word.toLowerCase();
        
        StringBuilder pigLatinWord = new StringBuilder(word);
        StringBuilder newWordValue;
     	
     	for (int i = 0; i <pigLatinWord.length();i++) {
     		char testCharacter = pigLatinWord.charAt(i);
     		if (vowels.indexOf(testCharacter)>=0) {
     		   firstVowel = i;
     		   break;
     		}   
     	 }	  
     	/**
     	 * @see 
     	 * If the position of the first vowel in the word is greater than zero, the word is altered for the
     	 * start position of the output string.  Prefix is the altered word with the first vowel as the start
     	 * of the translated word.   The value 'ay' is added to the end of the prefix to complete the translation.
     	 * If there is no vowel in the word (Y is not considered a vowel in this class), newWordValue is appended
     	 * "way".
     	 */
     	if (firstVowel > 0)   {	 
     	   newWordValue = new StringBuilder(pigLatinWord.substring(firstVowel));
     	   String prefix = pigLatinWord.substring(0, firstVowel);
     	   newWordValue.append(prefix);
     	   newWordValue.append("ay");
     	   }
     	   else {
     		   newWordValue = new StringBuilder(pigLatinWord.substring(0));
     		   newWordValue.append("way");
        }
     	return newWordValue.toString();
	}

	@Override
	public void AddOutput(String s) {
		String tempWord=convert(s);
		lines.add(tempWord);		
	}

	@Override
	public void Display() {
	  for(String displayWord :lines) {
		 System.out.print(displayWord + " "); 
	  }
	}

	@Override
	public void Clear() {
        lines.clear();	
	}

	@Override
	public void Println() {
		
	} 
}
