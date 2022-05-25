package java_DSA;


import java.util.*;
import java.collections;

public class Combination_Sum_02 {


	private static void combinationSum(int [] arr,int n,ArrayList<Integer> v,int idx,int s,int sum)
	{
		
			if(sum==0)
			{
				System.out.println(v);
				return;
			}
			
		
		for(int i=idx;i<arr.length;i++)
		{
			if(i > idx && arr[i]==arr[i-1] )
			{
				continue;
			}
			if(arr[i] > sum)
			{
				break;
			}
             v.add(arr[i]);
			
			combinationSum(arr,n,v,i+1,s,sum-arr[i]); // Pick condition
			
			v.remove(v.size()-1);
		}
			
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=sc.nextInt();
		ArrayList<Integer> v=new ArrayList<>();
		combinationSum(arr,n,v,0,0,sum);
		
		

	}

}
