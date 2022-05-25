package java_DSA;

import java.util.*;

// Queue implmentation using array

 class queue{
	 public int f=-1;
	 public int r=-1;
	 public int [] arr=new int[10];
	 
	 queue(){
		f=-1;
		r=-1;
	 }
	 
	 void push(int val)
	 {
		 if(r==9)
		 {
			 System.out.println("Queue is full you cannot insert in it");
			
		 }
		
		 r++;
		 if(f==-1)
		 {
			 f++;
		 }
		 arr[r]=val;
	 }
	 
	 
	 void pop()
	 {
		 if(f==-1 && r==-1)
		 {
			 System.out.println("Queue is underflow");
		 }
		 else
		 {
			 f++;
		 }
	 }
	 
	 int front()
	 {
		 return arr[f];
	 }
	 
	 int rear()
	 {
		 return arr[r];
	 }
	 
	 boolean empty()
	 {
		 if(f==-1 || r==-1)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
	 void display()
	 {
		 System.out.println("Your queue is:- ");
		 for(int i=f;i<=r;i++)
		 {
			 System.out.print(arr[i]+" -- ");
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
 }













public class Queue_Java {

	public static void main(String[] args) {
	    queue q=new queue();
	    q.push(3);
	    q.push(4);
	    q.push(5);
	    q.push(5);
	    q.display();
	    q.pop();
	    System.out.println();
	    q.push(10);
	    q.display();
	    System.out.println();
	   
	    System.out.println("Front of queue is:- "+q.front());
	    System.out.println("rear of queue is:- "+q.rear());

	}

}
