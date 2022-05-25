package src;

import java.util.*;

public class Merge_sort {

	void merge(int[] arr, int s, int e) {
		int i = s;
		int m = (s + e) / 2;
		int j = m + 1;

		ArrayList<Integer> list = new ArrayList<Integer>();

		while (i <= m && j <= e) {
			if (arr[i] < arr[j]) {
				list.add(arr[i]);
				i++;

			} else {
				list.add(arr[j]);
				j++;
			}
		}
		while (i <= m) {
			list.add(arr[i]);
			i++;
		}
		while (j <= e) {
			list.add(arr[j]);
			j++;
		}

		int k = 0;
		for (int i1 = s; i1 <= e; i1++) {
			arr[i] = list.get(k);
			k++;
		}
		return;

	}

	void mergeSort(int[] arr, int s, int e) {

		if (s < e) {
			int mid = (s + e) / 2;
			mergeSort(arr, s, mid);
			mergeSort(arr, mid + 1, e);

			merge(arr, s, e);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:- ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Merge_sort obj = new Merge_sort();
		obj.mergeSort(arr, 0, n - 1);
		System.out.println("The sorted array is:- ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
