package src;
import java.util.Scanner;
public class largest_no_three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Numbers:- ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a > b && b >c)
		{
			System.out.println("Greater is:- ");
			System.out.println(a);
		}
		else if(b >a && b >c)
		{
			System.out.println("Greater is:- ");
			System.out.println(b);
		}
		else
		{
			System.out.println("Greater is:- ");
			System.out.println(c);
		}
		

	}

}
