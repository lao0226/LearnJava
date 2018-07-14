package Homework1;
import java.util.Scanner;

public class RandomEcho {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		
		int number=input.nextInt();
		int randomNumber=(int)(number*Math.random());
		
		System.out.println("The random number between 0 and "+number+" is "+randomNumber+".");
		
		input.close();
	}
}
