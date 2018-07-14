package Homework6;

import java.util.Scanner;

public class GuessWord4 {

	public static void main(String args[]) {
		//define scanner, answer, result and times
		Scanner input= new Scanner(System.in);
		String answer=generateAnswer();
		String result=generateResult(answer.length());
		int times=10;
		
		//display welcome material, and user's initial status
		System.out.println("Welcome to the game GuessWord!");
		System.out.println("The word now looks like "+result);
		System.out.println("You have "+times+" chances left.");
		
		//if loop
		for(int i=times-1;i>=0;i--) {
			System.out.println("Please enter your guess word: ");
			String guess=input.nextLine();
			guess=guess.toUpperCase();
			
			//while loop to check if the input is legal
			while(guess.length()>1) {
				System.out.println("Illegal input! Please re-enter:");
				guess=input.nextLine();
				guess=guess.toUpperCase();
			}
			
			//check if the user guess the correct word
			int index=answer.indexOf(guess);
			
			//divide in to two categories: the user has correctly guess the word, and the user has not correctly guess the word
			//in the first category, it can still be divided into two categories: the user has guess out the whole word, and the user hasn't guess out the whole word
			if(index>=0) {
				result=refreshResult(result,index,answer,guess);
				if(result.equals(answer)) {
					System.out.println("Congratulations! You have correctly guess out the whole word.");
					System.out.println("The word is "+result);
					System.out.println("At the end, you have "+i+" times left!");
				}
				else {
					System.out.println("Your guess is correct!!!");
					System.out.println("Your new result is "+result);
					System.out.println("You still have "+i+" chances left.");
				}
			}
			else {
				System.out.println("The word you guess is incorrect");
				System.out.println("Your current result is "+result);
				System.out.println("You still have "+i+" chances left.");
			}
		}
		input.close();
	}
	
	private static String generateAnswer() {
		//generate a number from 1 to 6
		int number=(int)(Math.random()*6);
		
		//assign each number to a word
		if(number==1) {
			return "CHOCOLATE";
		}
		if(number==2) {
			return "HERB";
		}
		if(number==3) {
			return "CELLPHONE";
		}
		if(number==4) {
			return "SUNDAY";
		}
		if(number==5) {
			return "CALCULATOR";
		}
		else {
			return "HAPPY";
		}
	}
	
	private static String generateResult(int length) {
		String result="";
		for(int i=0;i<length;i++) {
			result+="*";
		}
		return result;
	}
	
	private static String refreshResult(String result,int index,String answer, String guess) {
		//use while loop to detect multiple occurance of the same letter
		while(index>=0) {
			result=result.substring(0, index)+guess+result.substring(index+1);
			index=answer.indexOf(guess, index+1);
		}
		return result;
	}
	
	
}
