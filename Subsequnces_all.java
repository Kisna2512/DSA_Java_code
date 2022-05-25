package java_DSA;

import java.util.ArrayList;
public class Subsequnces_all {

	static ArrayList<Integer> v=new ArrayList<Integer>();
	private static void fun(int [] arr,int ind,int n)
	{
//		ArrayList<Integer> v=new ArrayList<Integer>();
		
		if(ind >= n)
		{
			try {
				System.out.println(v);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
