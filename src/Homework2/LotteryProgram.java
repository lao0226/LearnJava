package Homework2;

import java.util.Scanner;

public class LotteryProgram {

	public static void main(String[] args) {
		//User total earned initially
	    int total=0;
	    System.out.println("Welcome to the Lottery Game!");
	    System.out.println("Here are some rules:");
	    System.out.println("1.You need to input a two digit number to start the game. After you entered the number,the system will generate a random two digit lottery number.");
	    System.out.println("2.If your two digit number exactly matches the lottery number, you win $10000.");
	    System.out.println("3.If your two digit number matches the lottery number, but in a different order(eg:31 and 13), you win $3000.");
	    System.out.println("4.If one digit in your input matches a digit in the lottery number, you win $1000.");
	    System.out.println("5.If no digit matches, you win $0.");
	    System.out.println("6.You have ten chances, and you will know the money you earned in total at the end.");
	    System.out.println();
	    
	    for(int i=0;i<10;i++){
	    	    //generates a lottery number
			int lottery=(int) (100*Math.random());
			
			
			//prompt user to enter a guess
			Scanner input=new Scanner(System.in);
			System.out.print("Please enter a guess(two digits)");
			int guess=input.nextInt();
			
			//get lottery digits
			int lottery1=(int)(lottery/10);
			int lottery2=lottery%10;
			
	        //get guess digits
			int guess1=(int)(guess/10);
			int guess2=guess%10;
		
			
			//show the lottery number
			System.out.println("The lottery number is "+lottery+".");
			
			//check the guess and show result
			if(lottery1==guess1&&lottery2==guess2) {
				System.out.println("Exact match! You win $10,000");
				total+=10000;
			}
			else if (lottery1==guess2&&lottery2==guess1) {
				System.out.println("Match two digits! You win$3000");
				total+=3000;
			}
			else if(lottery1==guess1||lottery1==guess2||lottery2==guess1||lottery2==guess2) {
				System.out.println("Match one digits! You win$1000");
				total+=1000;
			}
			else {
				System.out.println("No match, No win");
			}
			System.out.println("Your current total is $"+total);
			System.out.println();

	    }
	    System.out.println("You have used up your 10 chance. The total you win for this lottery is $"+total+"!");
	}
}
