package src;
import java.util.*;
public class Sum_natural_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :- ");
		int n=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println("The sum is:- "+sum);

	}

}
