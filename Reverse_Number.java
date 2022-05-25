package src;
import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int a=sc.nextInt();
		int rev=0;
		
		
	  while( a >0)
	  {
		  int rem=a%10;
		  rev=rev*10+rem;
		  a/=10;
	  }
	  System.out.println("The reversesd number is:- "+ rev);

	}

}
