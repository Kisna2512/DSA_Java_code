package src;

import java.util.*;


public class avadhesh {

	public static void main(String[] args) {

	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of which table is required");

		int n = sc.nextInt();
		
		for(int i = 1; i < 11 ; i ++) 
		{
			int calc = n * i ;
			
			System.out.println(n+"x"+i+" = "+calc);
		}
		

	}

}
