package Homework6;

import java.util.Scanner;

public class WithoutString {

	public static void main(String args[]) {
		//define a scanner  
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter a base and remove word
			System.out.println("Please enter a base: ");
			String base=input.nextLine();
			System.out.println("Please enter a remove: ");
			String remove=input.nextLine();
			
			//remove word
			String outcome=withoutString(base,remove);
			System.out.println("result: "+outcome);
		}
	}
	
	private static String withoutString(String base,String remove) {
		remove=remove.toLowerCase();
		int rleng=remove.length();
		String result=base;
		
		//find first index
		int index=base.toLowerCase().indexOf(remove);
		
		//while loop
		while(index>=0) {
			//index will change after delete 
			result=result.substring(0,index)+result.substring(index+rleng);
			index=result.toLowerCase().indexOf(remove);//start from 1st
		}
		return result;
	}
}
