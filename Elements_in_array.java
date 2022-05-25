package src;

import java.util.Scanner;

public class Elements_in_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter  the elements of array are: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println("Thew number of elemnts prsent in an array:- " + arr.length);

	}

}
