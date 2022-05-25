package src;


import java.util.*;


public class Heap_sort {

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i+1;
        int right = 2 * i + 2;

        if (left < n && arr[largest] < arr[left]) {
            largest = left;
        }
        if (right < n && arr[largest] < arr[right]) {
            largest = right;
        }
        if (largest != i) {

            swap(largest, i, arr);
            heapify(arr, n, largest);
        }
    }

    static void heapsort(int arr[], int n) {
    	 
    	        for (int i = n  - 1; i >= 0; i--)
    	        {
    	            heapify(arr, n, i);
    	        }
    	     
    	        for (int i=n-1; i>=0; i--)
    	        {
    	          
    	            int temp = arr[0];
    	            arr[0] = arr[i];
    	            arr[i] = temp;
    	            heapify(arr, i, 0);
    	        }    
    }

    public static void swap(int x, int y, int[] arr) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n = sc.nextInt();

        int[] arr = new int[n ];
        System.out.println("Enter " + n + " elements in array:- ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n / 2-1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        System.out.println("After heap sort:- ");
        heapsort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}