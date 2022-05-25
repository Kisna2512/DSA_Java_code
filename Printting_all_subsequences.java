package java;

import java.util.*;

public class Printting_all_subsequences {

	
	private static void fun(int [] arr,int ind,int n)
	{
		ArrayList<Integer> v=new ArrayList<Integer>();
		
		if(ind >= n)
		{
			System.out.println(v);
			return;
		}
		
		v.add(arr[ind]);
		fun(arr,ind+1,n);
		v.remove(ind);
		
		fun(arr,ind+1,n);

		
	}
	
	public static void main(String[] args) {
		
		int [] arr= {3,1,2};
		int n=3;
		fun(arr,0,n);

	}

}
