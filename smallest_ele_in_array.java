package src;

import java.util.*;

public class smallest_ele_in_array {

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

		int mini = arr[0];
		for (int i = 0; i < n; i++) {
			if (mini > arr[i]) {
				mini = arr[i];
			}
		}

		System.out.println("The smallest element in an array:- " + mini);

	}

}
