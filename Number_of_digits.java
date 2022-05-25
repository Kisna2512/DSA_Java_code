package src;

import java.util.*;
public class Number_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int a=sc.nextInt();
	       int cnt=0;
	      
	       while(a > 0)
	       {
	    	   int rem=a%10;
	    	   cnt++;
	    	   a/=10;
	       }
	       System.out.println("The Number of digits is:- "+cnt);
	}

}
