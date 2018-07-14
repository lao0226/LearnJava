package Homework6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FindFirstName2 {
	
	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter the names
			System.out.println("Enter names(enter quit to quit the program):");
			String names=input.nextLine();
			if(names.equals("quit")) break;
			
			//find out the first name
			String firstName=firstName(names);
			
			//print out the result
			System.out.println("The first name is "+firstName);
		}
		input.close();
	}
	
	private static String firstName(String names) {
		StringTokenizer st=new StringTokenizer(names);
		String firstName="";
		if(st.hasMoreTokens()) {
			firstName=toTitle(st.nextToken());
		}
		
		String name="";
		while(st.hasMoreTokens()) {
			name=toTitle(st.nextToken());
			if(name.compareTo(firstName)<0) {
				firstName=name;
			}
		}		
		return firstName;
	}
	
	private static String toTitle(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if(i==0) {
				result+=Character.toUpperCase(str.charAt(i));
			}
			else {
				result+=Character.toLowerCase(str.charAt(i));
			}
		}
		return result;
	}
	
}
