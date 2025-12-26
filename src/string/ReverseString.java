package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to be reversed:  ");
		String string = scan.nextLine();
		System.out.println("Reversed String: ");
		System.out.println(reverse(string));
		scan.close();
	}
	public static String reverse(String string) {
		String temp = "";
		for(int i=string.length()-1; i>=0; i--) {
			temp = temp + string.charAt(i);
		}
		return temp;
	}

}
