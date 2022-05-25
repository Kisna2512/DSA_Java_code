package java_DSA;

public class java_recursion {
	
//	static void fun(int i,int n)
//	{
//		if(i > n)
//		{
//			return;
//		}
//		
////		System.out.println(i); 1---n
//		fun(i+1,n);
//		System.out.println(i); // n--1
//		
//	}
	
//	static void fun(int i)
//	{
//		if(i < 1)
//		{
//			return;
//		}
//		
////		System.out.println(i); 1---n
//		System.out.println(i); // n--1
//		fun(i-1);
////		System.out.println(i); // n--1
//		
//	}
	
	
	
	
	
//	static void fun(int i,int sum)
//	{
//		if(i < 1)
//		{
//			System.out.println(sum);
//			return;
//		}
//		
//		
//		
//		fun(i-1,sum+i);
//		
//		
//		
//		
//		
//		
//		
//	}
	
	static int fun(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		
		return n*fun(n-1);
		
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(fun(3));
	}

}
