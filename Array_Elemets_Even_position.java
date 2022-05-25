package src;

import java.util.Scanner;

public class Array_Elemets_Even_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter  the elements of array are: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println("At even position:- " + i + "->" + arr[i]);
			}
		}

	}

}
