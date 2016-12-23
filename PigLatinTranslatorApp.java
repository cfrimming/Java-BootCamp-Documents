import java.util.Scanner;

/**
 * 
 * @author Chris Frimming
 * 
 * @version 1.0
 * 
 * @see
 * 
 * PigLatinTranslatorApp - This program will take a phrase from the console and convert it to Pig Latin.
 * 
 * It uses the displayable interface implemented by the FormatWord class to translate the console input.
 * The variable Words is created as a string array of the user input entered in phrase for all strings
 * separated by a space. 
 */

public class PigLatinTranslatorApp {
	public static void main(String[] args) {
	       Displayable translatedWord = new FormatWord();
	       
	       
	       System.out.println("Welcome to the Pig Latin Translator.");   
	       System.out.println();
	
	       Scanner consoleScanner = new Scanner(System.in);
	       String choice = "y";
	
	       while (choice.equalsIgnoreCase("y"))
	       {
	           System.out.println("Enter line to be translated to pig latin:");
	          
	           String phrase = consoleScanner.nextLine();
	           String [] words = phrase.split(" ");
	           
	           /**
	            * @see
	            * For each iteration of the words array, the AddOutput method of FormatWord 
	            * will be executed to translate the word into pig Latin.
	           */ 
	           for (int i = 0; i< words.length; i++) {
	                translatedWord.AddOutput(words[i]);
	           }
	           
	           translatedWord.Display();
	           translatedWord.Clear();
	           
	           boolean isValid = false;
	           
	           while (!isValid) {
	        	   System.out.print("\nContinue? (y/n): ");
	               choice = consoleScanner.nextLine();
	               if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("y"))
	            	   isValid = true; 
	           }
	       }
	       consoleScanner.close();
	   }
}