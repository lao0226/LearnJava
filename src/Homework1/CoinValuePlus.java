package Homework1;
import java.util.Scanner;

public class CoinValuePlus {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How many pennies do you have?");
		int pennies= input.nextInt();
		
		System.out.println("How many dimes fo you have?");
		int dimes=input.nextInt();
		
		System.out.println("How many quarters do you have?");
		int quarters= input.nextInt();
		
		double totalValue=pennies*0.01 + dimes*0.10 +quarters*0.25;
	    System.out.println("Total value= $"+totalValue);
	    
	    input.close();
		
	}
}
