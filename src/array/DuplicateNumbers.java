package array;

import java.util.Scanner;

public class DuplicateNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of sorted array: ");
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		duplicateNumbers(array);
		scan.close();
	}
	
	public static void duplicateNumbers(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			if(array[i]==array[i+1]) {
				if(i==0 || array[i]!=array[i-1]) {
					System.out.print(array[i] + " ");
				}
			}
		}
	}

}
