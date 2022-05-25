package java_DSA;

import java.util.ArrayList;

public class Count_subsquence {

	static int print(int arr[],int n,int s,int sum,int id)
	{
		
		if(id==n)
		{
			if(s==sum)
			{
				return 1;
			}
			return 0;
		}
		
		
		int l=print(arr,n,s+arr[id],sum,id+1);
		
		
		int r=print(arr,n,s,sum,id+1);
		
		return l+r;
		
		
		
	}
	
	public static void main(String[] args) {
		int [] arr= {1,2,1,3};
	    System.out.println("Number of sub-seqence are: ");
		System.out.println(print(arr,4,0,3,0));


	}

}
