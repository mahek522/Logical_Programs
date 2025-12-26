package array;

import java.util.Scanner;

public class DuplicateNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array:");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of sorted array: ");
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		duplicateNumbers(a);
		scan.close();
	}
	public static void duplicateNumbers(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			if(a[i]==a[i+1]) {
				if(i==0 || a[i]!=a[i-1]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}

}
