package Homework2;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your weight in kilograms:");
		double weight=input.nextDouble();
		System.out.println("Please enter your height in meters:");
		double height=input.nextDouble();
		double bmi=weight/(height*height);
		
		if(bmi<18.5) {
			System.out.print("Underweight");
		}
		else if(bmi<25.0){
			System.out.print("Normal");
		}
		else if(bmi<30) {
			System.out.print("Overweight");
		}
		else {
			System.out.print("Obese");
		}
		input.close();
		}
		
	}

		
	
