package array;

import java.util.Scanner;

public class PrintArrayPairs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		printArrayPairs(array);
		scan.close();
	}
	public static void printArrayPairs(int[] array) {
		System.out.println("Array pairs: ");
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				System.out.println(array[i] +" "+ array[j]);
			}
		}
	}

}
