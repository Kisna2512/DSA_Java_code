package src;


import java.util.*;

class Animal{
	void parent_method()
	{
		System.out.println("The animal class method is running");
	}
}

class Dog extends Animal{
	void child_method()
	{
		System.out.println("The Dog class method is working");
	}
}



public class java_practise_02 {

	public static void main(String[] args) {
		Dog D=new Dog();
//		D.child_method();
		D.parent_method();

	}

}
