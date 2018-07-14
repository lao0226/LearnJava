package ClassExample;

import java.util.Scanner;

public class AMatrix {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number of rows?");
		int rows=input.nextInt();
		System.out.println("Please enter the number of coloumns");
		int columns=input.nextInt();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		input.close();
	}
}
