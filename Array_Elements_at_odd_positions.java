package src;

import java.util.Scanner;

public class Array_Elements_at_odd_positions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter  the elements of array are: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				System.out.println("At odd position:- " + i + "->" + arr[i]);
			}
		}

	}

}
