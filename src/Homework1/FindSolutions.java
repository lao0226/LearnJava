package Homework1;
import java.util.Scanner;

public class FindSolutions {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is coefficient a?");
		double a=input.nextDouble();
		
		System.out.println("What's the coefficient b?");
		double b=input.nextDouble();
		
		System.out.println("What's the coefficient c?");
		double c=input.nextDouble();
		
		double x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		double x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.println("x1 = "+x1);
		System.out.println("x2 = "+x2);
		
		input.close();
	}
}
