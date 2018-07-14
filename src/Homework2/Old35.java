package Homework2;

import java.util.Scanner;

public class Old35 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a non-negative integer");
		int number=input.nextInt();
		int remainer3=number%3;
		int remainer5=number%5;
		
		if(remainer3==0&&remainer5==0) {
			System.out.println("This is not an Old35");
		}
		else if(remainer3==0||remainer5==0){
			System.out.println("This is an Old35");
		}
		else {
			System.out.println("This is not an Old35");
		}
		
	}
}
