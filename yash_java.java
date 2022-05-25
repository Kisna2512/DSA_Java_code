package src;

import java.util.*;

public class yash_java {
	static int ind = 1;
	public static void display(ArrayList < Integer>vec) {
		int n = vec.size();
		for(int i=0;i<n;i++) {
			System.out.print(vec.get(i)+" ");
		}
		System.out.println("");		
	}
	
	public static void print_sub(ArrayList<Integer> vec, int [] arr, int n,int i) {
		if(i == n) {
			if(vec.size()!=0) {
				System.out.print(ind +". ");
				ind++;
				display(vec);
			}
			return;
		}
		
//		perform take action
		vec.add(arr[i]);
		print_sub(vec,arr,n,i+1);
		vec.remove(vec.size()-1);
		
		print_sub(vec,arr,n,i+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int n;
	System.out.println("Enter the size of array :- ");
	n = sc.nextInt();
//	System.out.print(i);
	int arr[] = new int[n];
	for(int i=0;i<n;i++)arr[i]=sc.nextInt();
	
	ArrayList <Integer> vec = new ArrayList<>();
	
	print_sub(vec, arr,n,0);
	
	}

}
