package src;

//import java.collections;
import java.util.ArrayList;
public class Printing_All_Subsequences {

	private static void fun(int [] arr,ArrayList<Integer> v,int ind,int n)
	{
	
		
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
		fun(arr,v,ind+1,n);
		v.remove(ind);
		
		fun(arr,v,ind,n);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> v=new ArrayList<Integer>();
		int [] arr= {3,1,2};
		int n=3;
		fun(arr,v,0,n);

	}

}
