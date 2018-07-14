package Homework6;

import java.util.Scanner;

public class GuessWord2 {

	public static void main(String[] args) {
		//define an answer,result,times
		Scanner input=new Scanner(System.in);
		int times=10;
		String answer=generateAnswer();
		String result=generateResult(answer.length());
		
		//Welcome material and print out the initial status
		System.out.println("Welcome to the guess word!!");
		System.out.println("The word now looks like "+result);
		System.out.println("You have "+times+" left");
		
		//each for loop represent user guess the word and see the result for once
		for(int i=times-1;i>=0;i--) {
			//promote user to enter the guess and convert the guess to upper case
			System.out.println("Your letter guess: ");
			String guess=input.nextLine();
			guess=guess.toUpperCase();
			//while loop to correct illegal enter
			while(guess.length()>1) {
				System.out.println("Re-enter your letter guess: ");
				guess=input.nextLine();
				guess=guess.toUpperCase();
			}
			
			//find out guess's index(first check)
			int index=answer.indexOf(guess);
			
			//If index<=0, the letter is not in the word.If the index is >=0, the letter is in the word.
			//When index>=0,see if the user has guess out the whole word.
			if(index>=0) {
				result=refreshResult(result,index,answer,guess);//check and change the result, and change "*" to the letter that is being guessed(second check)
				if(result.equals(answer)) {
					//guess out the whole word
					System.out.println("You win!!!!");
					System.out.println("Your final result is "+result);
					break;
				}
				else {
					//haven't guess out the whole word, but guess out one letter
					System.out.println("The letter "+guess+" is correct!!");
					System.out.println("Your new result is "+result);
					System.out.println("You have "+i+" chances left");
				}
			}
			else {
				//guess the wrong letter
				System.out.println("The letter "+guess+" is not correct");
				System.out.println("Your new result is "+result);
				System.out.println("You have "+i+" chances left");
			}
		}
		input.close();
	}
	
	private static String generateAnswer() {
		//generate a random number from 1 to 6
		int number=(int)(Math.random()*6);
		//define return variable answer
		String answer="";
		if(number==0) {
			answer="food";
		}
		if(number==1) {
			answer="delicious";
		}
		if(number==2) {
			answer="cellphone";
		}
		if(number==3) {
			answer="microcomputer";
		}
		if(number==4) {
			answer="chocolate";
		}
		if(number==5) {
			answer="mouse";
		}
		//return the capitalized version of the answer
		return answer.toUpperCase();
	}
	
	private static String generateResult(int length) {
		//define the result that is going to be returned
		String result="";
		for(int i=0;i<length;i++) {
			result+="*";
		}
		return result;
	}
	
	private static String refreshResult(String result,int index,String answer, String guess) {
		//while loop to find out letter that appears few times in the word
		while(index>=0) {
			result=result.substring(0, index)+guess+result.substring(index+1);
			//check if there is still another index number(same letter that appears few times in the letter)
			index=answer.indexOf(guess, index+1);
		}
		return result;
	}
}
