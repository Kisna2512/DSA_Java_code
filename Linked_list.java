package src;

import java.util.*;


class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	public void insert(Node head,int data)
	{
		if(head==null)
		{
			Node n=new Node(data);
			head=n;
		}
		else
		{
			Node n=new Node(data);
			head=n;
			head.next=null;
		}
	}
	
	public void display(Node head)
	{
		
	}
}



public class Linked_list {

	public static void main(String[] args) {
		
         
		Node obj=new Node(5);
		obj.insert(obj, 3);
		obj.insert(obj, 3);
		obj.insert(obj, 3);
		obj.insert(obj, 3);
		obj.insert(obj, 3);
		
		
		
		
		
		
		
	}

}
