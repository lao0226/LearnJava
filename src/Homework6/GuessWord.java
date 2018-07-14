package Homework6;

import java.util.Scanner;

public class GuessWord {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int guessTimes=8;
		String guessWord=generateGuessWord();
		String guessResult=generateGuessResult(guessWord.length());
		
		System.out.println("Welcome to the GuessWord: ");
		System.out.println("The word now looks like this: "+guessResult);
		System.out.println("You have "+guessTimes+" guesses left");
		
		for(int i=guessTimes-1;i>=0;i--) {
			System.out.println("Your guess is: ");
			String initialGuessLetter=input.next();
			String guessLetter=initialGuessLetter.toUpperCase();
			
			int index=guessWord.indexOf(guessLetter);
			
			if(index>=0) {
				System.out.println("Your guess is correct.");
				guessResult=refreshResult(guessLetter,guessWord,guessResult);
				if(guessResult.equals(guessWord)) {
					System.out.println("The word now looks like this: "+guessResult);
					System.out.println("You win!!");
					break;
				}
				else {
					System.out.println("The word now looks like this: "+guessResult);
					System.out.println("You have "+i+" guesses left");
				}
			}
			else {
				System.out.println("There are no "+guessLetter+" in the word.");
				System.out.println("The word now looks like this: "+guessResult);
				System.out.println("You have "+i+" guesses left");
			}
		}	
	}
	
	
	private static String generateGuessWord() {
		int wordNumber=(int)(Math.random()*6);
		String guessWord="";
		if(wordNumber==0) {
			guessWord="loll";
		}
		if(wordNumber==1) {
			guessWord="rea";
		}
		if(wordNumber==2) {
			guessWord="credi";
		}
		if(wordNumber==3) {
			guessWord="greate";
		}
		if(wordNumber==4) {
			guessWord="valuabl";
		}
		if(wordNumber==5) {
			guessWord="goodieqw";
		}
		return guessWord.toUpperCase();
	}
	
	private static String generateGuessResult(int length) {
		String result="";
		for(int i=0;i<length;i++) {
			result+="*";
		}
		return result;
	}
	
	private static String refreshResult(String guessLetter,String guessWord, String guessResult) {
		String result="";
		for(int i=0;i<guessWord.length();i++) {
			if(guessResult.charAt(i)=='*') {
				if(guessLetter.charAt(0)==guessWord.charAt(i)) {
					result+=guessWord.charAt(i);
				}
				else {
					result+="*";
				}
			}
			else {
				result+=guessResult.charAt(i);
			}
		}
		return result;
	}
}

