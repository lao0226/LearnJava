package Homework5;

import java.util.Scanner;

public class RemovePunSentenceTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter a sentence
			System.out.println("Please enter a word or sentence(0 to quit):");
			String sentence=input.nextLine();
			if(sentence.equals("0")) break;
			
			//remove punctuations and space
			String sentenceNoPunNoSpace=removePunAndSpace(sentence);
			
			//print sentenceNoPun
			System.out.println(sentenceNoPunNoSpace);
		}
		input.close();
	}
	
	private static String removePunAndSpace(String sentence) {
		String result="";
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)!='.' && sentence.charAt(i)!=',' && sentence.charAt(i)!='\'' && sentence.charAt(i)!=' ') {
				result+=sentence.charAt(i);
			}
		}
		return result;
	}
}
