package array;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = scan.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements with a missing number: ");
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println(missingNumber(a));
		scan.close();
	}
	public static int missingNumber(int[] a) {
		int n = a.length + 1;
		int sum1 = n * (n+1)/2;
		int sum2=0;
		for(int i=0; i<a.length; i++) {
			sum2+=a[i];
		}
		return sum1-sum2;
	}

}
