package ClassExample;

import java.util.Scanner;

public class DeterminePalindrome {

	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter a word(0 to quit):");
			String word=input.nextLine();
			if(word.equals("0")) break;
			
			//invert the word
			String invertedWord=invertedWord(word);
			
			//compare the two word
			if(invertedWord.equals(word)) {
				System.out.println("It is a Palindrome");
			}
			else {
				System.out.println("This is not a Palindrome");
			}
		}
		input.close();
	}
	
	private static String invertedWord(String word) {
		String result="";
		for(int i=word.length()-1;i>=0;i--) {
			result+=word.charAt(i);
		}
		return result;
	}
	
	
}
