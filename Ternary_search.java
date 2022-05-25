package src;

import java.util.*;

public class Ternary_search {

	static int ternary_search(int[] arr, int n, int target) {
		int low = 0;
		int high = n - 1;

		while (low <= high) {
			int mid1 = low + (high - low) / 3;
			int mid2 = high - (high - low) / 3;

			if (arr[mid1] == target) {
				return mid1;
			}
			if (arr[mid2] == target) {
				return mid2;
			}

			if (target < arr[mid1]) {
				high = mid1 - 1;
			} else if (target > arr[mid2]) {
				low = mid2 + 1;
			} else {
				low = mid1 + 1;
				high = mid2 - 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:- ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the " + n + " elements in an array:-  ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter the element you want to search:- ");
		int target = sc.nextInt();
		if (ternary_search(arr, n, target) < 0) {
			System.out.println("Your target element is not present in array");
		} else {
			System.out.println("Your target element is present at index: " + ternary_search(arr, n, target));
		}

	}

}
