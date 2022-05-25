package Maths_DSA;

import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		
		if((n & 1)==1)
		{
			System.out.println("It is an odd number");
		}
		else
		{
			System.out.println("It is a even Number");
		}

	}

}
