package src;

import java.util.*;

public class Print_Elements_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:- ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("The Elements of an array:- ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
