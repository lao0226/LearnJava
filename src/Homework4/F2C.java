package Homework4;

import java.util.Scanner;

public class F2C {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter a temperature
			System.out.println("Please enter a temperature(0 to quit): ");
			double temperature=input.nextInt();
			if(temperature==0) break;
			
			//prompt user to choose from Fahrenheit and Celsius
			System.out.println("Fahrenheit or Celsius(0 for Fahrenheit and 1 for Celsius)");
			int type=input.nextInt();
			
			//F2C or C2F and print the result
			if(type==0) {
				double celsius=F2C(temperature);
				System.out.println("The temperature in Celsius is "+celsius+".");
			}
			if(type==1) {
				double fahrenheit=C2F(temperature);
				System.out.println("The temperature in Fahrenheit is "+fahrenheit+".");
			}
			
		}
		input.close();
	}
	
	/**
	 * Convert temperature from Fahrenheit to Celsius
	 * @param temperature in Fahrenheit
	 * @return temperature in Celsius
	 */
	private static double F2C(double f) {
		double c=Math.round((5.0/9.0)*(f-32));
		return c;
	}
	/**
	 * Convert temperature from Celsius to Fahrenheit
	 * @param temperature in Celsius
	 * @return temperature in Fahrenheit
	 */
	private static double C2F(double c) {
		double f=Math.round((9.0/5.0)*c+32);
		return f;
	}
	
	
}
