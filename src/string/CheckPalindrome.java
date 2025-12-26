package string;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check for Palindrome:");
		String s = scan.nextLine();
		if(isPalindrome(s)) {
			System.out.println("Yes, it is Palindrome.");
		}
		else {
			System.out.println("No, it is not a Palindrome.");
		}
		scan.close();
	}
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
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
