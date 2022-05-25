package src;

import java.util.*;

public class insertion_sort {

	static void insertionSort(int[] arr, int n) {
		int i, j, key;
		for ( i = 1; i < n; i++) {
			key = arr[i];
			System.out.println("key:- "+key);
			j = i - 1;
			System.out.println("j:- "+j);

			while (j >= 0 && arr[j] > key) {
				System.out.print("arr[j]:- "+arr[j]);
				arr[j + 1] = arr[j];
				System.out.println("j:- "+j);
				j = j - 1;
				System.out.println("j-1:- "+j);
			}
			
			arr[j + 1] = key;
			System.out.print("arr[j+1]:- "+arr[j+1]);
		
//				System.out.print(" arr[i]:- "+arr[i] + " ");
				
				
			

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
       insertionSort(arr, n);
		System.out.println("Array is  sorted:- ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
			
		}

	}

}
