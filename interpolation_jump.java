package src;

import java.util.*;

public class interpolation_jump {

	public static int interpolation_search(int[] arr, int n, int target) {
		int low = 0;
		int high = n - 1;

		while (low <= high && target >= arr[low] && target <= arr[high]) {
			if (low == high) {
				if (arr[low] == target) {
					return low;
				}
				return -1;
			}

			int pos = low+ ((int) (high - low) / (arr[high] - arr[low])) * (target - arr[low]);
			if (arr[pos] == target) {
				return pos;
			}

			if (arr[pos] < target) {
				low = pos + 1;
			}

			if (arr[pos] > target) {
				high = pos - 1;
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
		if (interpolation_search(arr, n, target) < 0) {
			System.out.println("Your target element is not present in array");
		} else {
			System.out.println("Your target element is present at index: " + interpolation_search(arr, n, target));
		}

	}

}
