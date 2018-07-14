package Homework6;

import java.util.Scanner;

public class GuessWord3 {

	public static void main(String[] args) {
		//define guessTime, answer, and result
		Scanner input=new Scanner(System.in);
		int guessTime=10;
		String answer=generateAnswer();
		String result=generateResult(answer);
		
		//print out the instructions and welcome sentences
		System.out.println("Welcome to the GuessWord: ");
		System.out.println("The word now looks like this: "+result);
		System.out.println("You have "+guessTime+" guesses left");
		
		for(int i=guessTime-1;i>=0;i--) {
			//prompt user to enter a guess letter, and check if the guess number is legal
			System.out.println("Please enter a guess letter: ");
			String initialGuessLetter=input.nextLine();
			String guessLetter=initialGuessLetter.toUpperCase();
			while(guessLetter.length()>1) {
				System.out.println("Please re-enter a guess letter: ");
				initialGuessLetter=input.nextLine();
				guessLetter=initialGuessLetter.toUpperCase();
			}
			
			//find a index number for the guessLetter
			int index=answer.indexOf(guessLetter);
			
			if(index>=0){
				result=refreshResult(result,index,guessLetter,answer);
				if(result.equals(answer)) {
					System.out.println("You win the game!!!!");
					System.out.println("Here is your current result: "+result);
					break;
				}
				else {
					System.out.println("It is correct!!");
					System.out.println("Here is your current result: "+result);
					System.out.println("You have "+i+" chances left");
				}
			}
			else {
				System.out.println("There are no "+guessLetter+" in the word.");
				System.out.println("Here is your current result: "+result);
				System.out.println("You have "+i+" chances left");
			}
		}
	}
	
	
	private static String generateAnswer() {
		int number=(int)(Math.random()*6);
		String answer="";
		if(number==0) {
			answer="enjoy";
		}
		if(number==1) {
			answer="knight";
		}
		if(number==2) {
			answer="pencil";
		}
		if(number==3) {
			answer="chocolate";
		}
		if(number==4) {
			answer="food";
		}
		if(number==5) {
			answer="mouse";
		}
		return answer.toUpperCase();
	}
	
	private static String generateResult(String answer) {
		String result="";
		for(int i=0;i<answer.length();i++) {
			result+="*";
		}
		return result;
	}
	
	private static String refreshResult(String result,int index,String guessLetter,String answer) {
		while(index>=0) {
			result=result.substring(0, index)+guessLetter+result.substring(index+1);
			index=answer.indexOf(guessLetter,index+1);
		}
		return result;
	}
	
	
}
