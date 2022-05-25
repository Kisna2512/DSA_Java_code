package java_DSA;


import java.util.*;

public class Combintion_sum {

	
	
	private static void combinationSum(int [] arr,int n,ArrayList<Integer> v,int idx,int s,int sum)
	{
		if(idx==n)
		{
			if(s==sum)
			{
				System.out.println(v);
				return;
			}
			return;
		}
		
		
		if(s < sum)
		{
			v.add(arr[idx]);
			s+=arr[idx];
			combinationSum(arr,n,v,idx,s,sum); // Pick condition
			s-=arr[idx];
			v.remove(v.size()-1);
		}
		
		
		combinationSum(arr,n,v,idx+1,s,sum); // Not pick condition
		
	
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		ArrayList<Integer> v=new ArrayList<>();
		combinationSum(arr,n,v,0,0,sum);
		
		

	}

}
