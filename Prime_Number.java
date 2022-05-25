package Maths_DSA;

import java.util.*;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=false;
		if(n==0 || n==1)
		{
			System.out.println("It is not a prime Number");
		}
		
		for(int i=2;i<n;i++)
		{
			
			if(n%i==0)
			{
				System.out.println("It is not  Prime Number");
				flag=true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println("It is a Prime Number");
		}

	}

}
