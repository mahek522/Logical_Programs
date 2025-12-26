package array;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		largestSmallest(array);
		scan.close();
	}
	public static void largestSmallest(int[] array) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++) {
			if(array[i]>largest) {
				largest = a[i];
			}
		}
		for(int i=0; i<array.length; i++) {
			if(array[i]<smallest) {
				smallest = a[i];
			}
		}
		System.out.println("Largest Element: "+largest);
		System.out.println("Smallest Element: "+smallest);

		
	}

}
