package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to be reversed:  ");
		String s = scan.nextLine();
		System.out.println("Reversed String: ");
		System.out.println(reverse(s));
		scan.close();
	}
	public static String reverse(String s) {
		String t = "";
		for(int i=s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);
		}
		return t;
	}

}
