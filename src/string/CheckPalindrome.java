package string;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check for Palindrome:");
		String string = scan.nextLine();
		if(isPalindrome(string)) {
			System.out.println("Yes, it is Palindrome.");
		}
		else {
			System.out.println("No, it is not a Palindrome.");
		}
		scan.close();
	}
	public static boolean isPalindrome(String string) {
		int i=0;
		int j=string.length()-1;
		while(i<j) {
			if(string.charAt(i)!=string.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}

}
