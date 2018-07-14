package ClassExample;

import java.util.Scanner;

public class Draft {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String str=input.nextLine();
		System.out.println(str.length());
		input.close();
		char line='b';
		String book="like";
	}
}
