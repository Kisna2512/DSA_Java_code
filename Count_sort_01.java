package src;

import java.util.Scanner;

public class Count_sort_01 {

	static void count_sort(int [] arr,int n)
	{
		int maxi=arr[0];
		for(int i=0;i<n;i++)
		{
			maxi=Math.max(maxi, arr[i]);
		}
		
		
		int [] count_arr= new int[100];
		for(int i=0;i<100;i++)
		{
			count_arr[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			count_arr[arr[i]]++;
		}
		
		for(int i=1;i<=maxi;i++)
		{
			count_arr[i]+=count_arr[i-1];
		}
		int [] output_arr=new int[n];
		for(int i=n-1;i>=0;i--)
		{
			output_arr[--count_arr[arr[i]]]=arr[i];
		}
		
		for(int i=0;i<n;i++)
		{
			output_arr[i]=arr[i];
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
		count_sort(arr,n);
		System.out.println("The sorted array is:- ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
