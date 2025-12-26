package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array elements to be reversed:");
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		reverseArray(array);
		scan.close();
	}
	public static void reverseArray(int[] array) {
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
