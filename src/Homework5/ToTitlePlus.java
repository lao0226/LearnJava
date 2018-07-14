package Homework5;

import java.util.Scanner;

public class ToTitlePlus {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter a title
			System.out.println("Please enter the name of the title(0 to quit):");
			String title=input.nextLine();
			if(title.equals("0")) break;
			
			//convert to title format
			String convertedTitle=toTitle(title);
			
			//print out the result
			System.out.println(convertedTitle);
		}
		input.close();
	}
	
	private static String toTitle(String title) {
		String result="";
		for(int i=0;i<title.length();i++) {
			if(i==0) {
				result+=Character.toUpperCase(title.charAt(i));
			}
			else if(title.charAt(i-1)==' ') {
				result+=Character.toUpperCase(title.charAt(i));
			}
			else {
				result+=Character.toLowerCase(title.charAt(i));
			}
			
		}
		return result;
	}
}
