package Homework3;

import java.util.Scanner;

public class AsteriskTriangle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true) {
			//prompt user to input the height
			System.out.println("Please enter the height of the triangle(enter 0 to quit): ");
			int height=input.nextInt();
			
			//re-enter if smaller than 0
			while(height<0) {
				System.out.println("Please re-enter a number that is greater than 0 or enter 0 to quit: ");
				height=input.nextInt();
			}
			
			//quit if user enter 0(for first time enter or re-enter)
			if(height==0) break;
			
			//print * (i as the row number)
			for(int i=1;i<=height;i++) {
				for(int j=0;j<i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
		input.close();
	}
}
