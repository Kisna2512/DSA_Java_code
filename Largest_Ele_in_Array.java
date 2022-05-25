package src;
import java.util.Scanner;
public class Largest_Ele_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter  the elements of array are: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		
		int maxi=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] > maxi)
			{
				maxi=arr[i];
			}
		}
		
		System.out.println("The largest element in an array:- "+maxi);
 
	}

}
