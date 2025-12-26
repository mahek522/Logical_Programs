package array;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		largestSmallest(a);
		scan.close();
	}
	public static void largestSmallest(int[] a) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]<smallest) {
				smallest = a[i];
			}
		}
		System.out.println("Largest Element: "+largest);
		System.out.println("Smallest Element: "+smallest);

		
	}

}
