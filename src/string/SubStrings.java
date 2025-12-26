package string;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = scan.nextLine();
		subStrings(string);
		scan.close();
		
	}
	public static void subStrings(String string) {
		
		for(int size=1; size<=string.length(); size++) {
			for(int i=0; i<=string.length()-size; i++) {
				for(int j=i; j<i+size; j++) {
					System.out.print(string.charAt(j));
				}
				System.out.println();
			}
		}
	}

}
