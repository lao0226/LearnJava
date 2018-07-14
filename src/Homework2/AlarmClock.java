package Homework2;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Are you on vacation, true or false?");
		boolean isOnVacation=input.nextBoolean();
		System.out.println("What day is today(0-6)?");
		int day=input.nextInt();
		
		if(isOnVacation) {
			if(day==1||day==2||day==3||day==4||day==5) {
				System.out.println("Get up at 10:00");
			}
			else if(day==0||day==6) {
				System.out.println("No alarm clock");
			}
			else {
				System.out.println("You can only enter number from 0 to 6");
			}
		}
		else {
			if(day==1||day==2||day==3||day==4||day==5) {
				System.out.println("Get up at 7:00");
			}
			else if(day==0||day==6){
				System.out.println("Get up at 10:00");
			}
			else {
				System.out.print("You can only enter number from 0 to 6");
			}
		}
		input.close();
	}
}
