package java_DSA;

import java.util.ArrayList;

public class Print_all_sequnce_02 {

	static boolean print(int arr[],int n,ArrayList<Integer> v,int s,int sum,int id)
	{
		
		if(id==n)
		{
			if(s==sum)
			{
				System.out.println(v);
				return true;
			}
			return false;
		}
		
		v.add(arr[id]);
		if(print(arr,n,v,s+arr[id],sum,id+1)) return true;
		v.remove(v.size()-1);
		
		if(print(arr,n,v,s,sum,id+1)) return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		int [] arr= {1,2,1};
		ArrayList<Integer> v=new ArrayList<>();
		boolean flag=print(arr,3,v,0,2,0);
		

	}

}
