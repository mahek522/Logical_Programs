package array;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements with a missing number: ");
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println(missingNumber(array));
		scan.close();
	}
	public static int missingNumber(int[] array) {
		int n = array.length + 1;
		int sum1 = n * (n+1)/2;
		int sum2=0;
		for(int i=0; i<array.length; i++) {
			sum2+=array[i];
		}
		return sum1-sum2;
	}

}
