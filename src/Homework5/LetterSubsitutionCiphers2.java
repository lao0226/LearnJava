package Homework5;

import java.util.Scanner;

public class LetterSubsitutionCiphers2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		while(true) {
			//prompt user to enter a 26-letter key
			System.out.println("Enter 26-letter key(0 to quit): ");
			String initialKey=input.nextLine();
			if(initialKey.equals("0")) break;
			
			//check the key
			while(!isLegalKey(initialKey)) {
				System.out.println("Re-enter 26-letter key(0 to quit): ");
				initialKey=input.nextLine();
				if(initialKey.equals("0")) break;
			}
			
			//pass the check
			String key=initialKey;
			
			
			//prompt user to enter the plaintext
			System.out.println("Plaintext: ");
			String initialPlainText=input.nextLine();
			
			//check the plain text
			while(!isLegalPlainText(initialPlainText)) {
				System.out.println("Re-enter plaintext: ");
				initialPlainText=input.nextLine();
			}
			
			//pass the check
			String plainText=initialPlainText;
			
			//generate the ciphertext and print out the result
			String cipherText=cipher(plainText,key);
			System.out.println("Ciphertext: "+cipherText);
			
			//generate the decryption text and print out the result
			String decryptionText=decryption(cipherText,key);
			System.out.println("Decryption: "+decryptionText);
		}
		input.close();
	}
	
	/**
	 * It is used to convert unciphered text to ciphered text
	 * @param plainText a String that is not ciphered
	 * @param key a String that correspond each key to a letter from A to Z
	 * @return result a String that is ciphered
	 */
	private static String cipher(String plainText,String key) {
		String result="";
		for(int i=0;i<plainText.length();i++) {
			if(!Character.isLetter(plainText.charAt(i))) {
				result+=plainText.charAt(i);
			}
			else {
				int position=plainText.charAt(i)-'A';
				result+=key.charAt(position);
			}
		}
		return result;
	}
	
	/**
	 * It is used to convert ciphered text to unciphered text
	 * @param cipherText a String that is ciphered 
	 * @param key a String that correspond each key to a letter from A to Z
	 * @return result a String that is not ciphered
	 */
	private static String decryption(String cipherText, String key) {
		String result="";
		for(int i=0;i<cipherText.length();i++) {
			if(!Character.isLetter(cipherText.charAt(i))) {
				result+=cipherText.charAt(i);
			}
			else {
				int position=key.indexOf(cipherText.charAt(i));
				result+=(char)('A'+position);
			}
		}
		return result;
	}
	
	/**
	 * It is used to check whether the key contains illegal element(more or less than 26 characters, lower case characters, repeated characters, and characters other than letter).
	 * @param initialKey a String that might be illegal which means that it might have more or less than 26 characters, lower case characters, repeated characters, and characters other than letter
	 * @return a boolean variable indicating that whether this key is legal or illegal
	 */
	private static boolean isLegalKey(String initialKey) {
		if(initialKey.length()!=26) {
			return false;
		}
		for(int i=0;i<initialKey.length();i++) {
			if(!Character.isUpperCase(initialKey.charAt(i))) {
				return false;
			}
			if(!Character.isLetter(initialKey.charAt(i))) {
				return false;
			}
			for(int k=i+1;k<26;k++) {
				if(initialKey.charAt(k)==initialKey.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * It is used to check whether the plaintext has illegal element(lower case characters).
	 * @param initialPlainText a String that might have lower case characters
	 * @return a boolean variable indicating that whether this plaintext is legal or illegal
	 */
	private static boolean isLegalPlainText(String initialPlainText) {
		for(int i=0;i<initialPlainText.length();i++) {
			if(Character.isLetter(initialPlainText.charAt(i))){
				if(!Character.isUpperCase(initialPlainText.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	
}
