package src;

public class hsah {

	static void fun(int [] arr,int l,int r)
	{
		if(l >= r)
		{
			return;
		}
		
		
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		
		
		fun(arr,l+1,r-1);
		
		
		
		
		
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		fun(arr,0,4);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}


	}

}
