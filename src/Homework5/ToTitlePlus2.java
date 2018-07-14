package Homework5;

import java.util.Scanner;

public class ToTitlePlus2 {

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
				result+=toUpperCase(title.charAt(i));
			}
			else if(title.charAt(i-1)==' ') {
				result+=toUpperCase(title.charAt(i));
			}
			else {
				result+=toLowerCase(title.charAt(i));
			}
			
		}
		return result;
	}
	
	private static char toUpperCase(char ch) {
		if(ch>='a' && ch<='z') {
			return (char)(ch-'a'+'A');
		}
		else {
			return ch;
		}
	}
	
	private static char toLowerCase(char ch) {
		if(ch>='A' && ch<='Z') {
			return (char)(ch-'A'+'a');
		}
		else {
			return ch;
		}
	}
}
