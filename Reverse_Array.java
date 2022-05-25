package src;

import java.util.*;

public class Reverse_Array {

	private static void reverse(int[] arr, int n) {
		int low = 0;
		int high = n - 1;

		while (low <= high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;

			low++;
			high--;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter  the elements of array are: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		reverse(arr, n);
		System.out.println("The array after reversal is:- ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
