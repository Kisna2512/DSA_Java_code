package Maths_DSA;

import java.util.Scanner;

public class Prime_Numbers_02 {
	static boolean printall(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		if(n==0 || n==1)
		{
			System.out.println("It is not a prime Number");
		}
		for(int i=2;i<=n;i++)
		{
			if(printall(i))
			{
				System.out.println(i);
			}
			
		}

	}

}
