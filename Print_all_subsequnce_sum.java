package java_DSA;

import java.util.*;

public class Print_all_subsequnce_sum {

	
	static void print(int arr[],int n,ArrayList<Integer> v,int s,int sum,int id)
	{
		
		if(id==n)
		{
			if(s==sum)
			{
				System.out.println(v);
			}
			return;
		}
		
		v.add(arr[id]);
		print(arr,n,v,s+arr[id],sum,id+1);
		v.remove(v.size()-1);
		
		print(arr,n,v,s,sum,id+1);
		
	}
	

	public static void main(String[] args) {
		int [] arr= {1,2,1,3};
		ArrayList<Integer> v=new ArrayList<>();
		print(arr,4,v,0,3,0);

	}

}
