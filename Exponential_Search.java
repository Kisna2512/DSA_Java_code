package src;

import java.util.Scanner;

public class Exponential_Search {
	private static int binary_search(int arr[], int low, int high, int target) {
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	private static int exponential_search(int arr[], int n, int target)
	{

	    if (arr[0] == target)
	    {
	        return 0;
	    }

	    int i = 1;
	    while (i < n && arr[i] <= target)
	    {
	        i = i * 2;
	    }
	    

	    return binary_search(arr, i / 2, Math.min(i, n - 1), target);
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
		if (exponential_search(arr, n, target) < 0) {
			System.out.println("Your target element is not present in array");
		} else {
			System.out.println("Your target element is present at index: " + exponential_search(arr, n, target));
		}

	}

}
