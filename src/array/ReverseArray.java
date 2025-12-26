package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements to be reversed:");
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		reverseArray(a);
		scan.close();
	}
	public static void reverseArray(int[] a) {
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
	}

}
