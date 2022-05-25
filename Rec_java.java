package java;

import java.util.ArrayList;

public class Rec_java {
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
		int [] arr= {3,2,1};
		fun(arr,0,3);
		

	}

	
}
