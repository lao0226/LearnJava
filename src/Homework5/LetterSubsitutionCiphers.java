package Homework5;

import java.util.Scanner;

public class LetterSubsitutionCiphers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//promote user enter a 26-letter key 
			System.out.println("Please enter a 26-letter key in capitalized letter(0 to quit):");
			String key=input.nextLine();
			if(key.equals("0")) break;
			
			//prompt user to enter the plain text
			System.out.println("Plaintext in capitalized letter:");
			String plainText=input.nextLine();
			
			
			//cipher plain text
			String cipherText=cipher(plainText,key);
			
			//print cipher text
			System.out.println("Cipher text: "+cipherText);
			
			//decryption text
			String decryptionText=decryption(cipherText,key);
			
			//print out decryption text
			System.out.println("Decryption text: "+decryptionText);
		}
		input.close();
	}
	
	

	
	private static String cipher(String plainText, String key) {
		String result="";
		for(int i=0;i<plainText.length();i++) {
			if(plainText.charAt(i)==' ') {
				result+=plainText.charAt(i);;
			}
			else {
				int letterNumber=plainText.charAt(i)-'A';
				char cipherCh=key.charAt(letterNumber);
				result+=cipherCh;
			}
		}
		return result;
	}
	
	
	
	private static String decryption(String cipherText, String key) {
		String result="";
		for(int i=0;i<cipherText.length();i++) {
			if(cipherText.charAt(i)==' ') {
				result+=cipherText.charAt(i);
			}
			else {
				for(int j=0;j<key.length();j++) {
					if(key.charAt(j)==cipherText.charAt(i)) {
						result+=(char)('A'+j);
					}
				}
			}
		}
		return result;
	}
	
	

}
