package Homework2;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Is today your birthday, true or false?");
		boolean isBirthday=input.nextBoolean();
		System.out.println("What is your speed?");
		int speed=input.nextInt();
		
		if(isBirthday) {
			if(speed<=65) {
				System.out.print("You have got no ticket.");
			}
			else if(speed<=85) {
				System.out.print("You have got a small ticket");
			}
			else {
				System.out.print("You have got a big ticket");
			}
		}
		else {
			if(speed<=60) {
				System.out.print("You have got no ticket");
			}
			else if(speed<=80) {
				System.out.print("You have got a small ticket");
			}
			else {
				System.out.print("You have got a big ticket");
			}
		}
		input.close();
	}
}
