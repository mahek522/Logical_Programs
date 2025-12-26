package array;

import java.util.Scanner;

public class PrintArrayPairs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		printArrayPairs(a);
		scan.close();
	}
	public static void printArrayPairs(int[] a) {
		System.out.println("Array pairs: ");
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				System.out.println(a[i] +" "+ a[j]);
			}
		}
	}

}
