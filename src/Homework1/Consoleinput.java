package Homework1;
import java.util.Scanner;

public class Consoleinput {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer:");
		int integer=input.nextInt();
		
		System.out.print("Enter a double:");
		double realNumber= input.nextDouble();
		
		System.out.println("You just entered "+integer+" and "+realNumber);
		
		input.close();
	}
}
