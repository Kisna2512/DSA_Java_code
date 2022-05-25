package src;


import java.util.*;

class circle{
	int radius;
	Scanner sc=new Scanner(System.in);
	void getRadius()
	{
		System.out.println("Enter the radius of circle:- ");
		radius=sc.nextInt();
	}
	
	int getArea()
	{
		return (int)(3.14*radius*radius);
	}
	
	
	
}

public class JAVA_practise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		circle c=new circle();
		c.getRadius();
	   System.out.println("The area is:- "+c.getArea());
	}

}
