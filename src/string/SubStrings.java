package string;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scan.nextLine();
		subStrings(s);
		scan.close();
		
	}
	public static void subStrings(String s) {
		
		for(int size=1; size<=s.length(); size++) {
			for(int i=0; i<=s.length()-size; i++) {
				for(int j=i; j<i+size; j++) {
					System.out.print(s.charAt(j));
				}
				System.out.println();
			}
		}
	}

}
