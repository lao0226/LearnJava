package Homework1;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		int a=input.nextInt();
		System.out.println("Please enter another integer");
		int b=input.nextInt();
		
		int sum=a+b;
		int max=Math.max(a, b);
		int min=Math.min(a, b);
		int difference=max-min;
		int product=a*b;
		int average=(a+b)/2;
		
		
		System.out.println("The bigger one is "+max);
		System.out.println("The smaller one is "+min);
		System.out.println("The difference is "+difference);
		System.out.println("The sum is "+sum);
		System.out.println("The product is "+product);
		System.out.println("The average is "+average);
	}
}
