



package java_DSA;

import java.util.*;


class Node{
	public int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
}


class Queue
{
	 Node head=null;
	
	void push(int val)
	{
	    if(head==null)
	    {
	    	Node n=new Node(val);
	    	n.next=head;
	    	head=n;
	    	return;
	    }
	    
	    Node nx=new Node(val);
	    
	    Node temp=head;
	    
	    while(temp.next!=null)
	    {
	    	temp=temp.next;
	    }
	    temp.next=nx;

	}
	
	void pop()
	{
		Node temp=head;
	    temp=temp.next;
	}
	
	
	boolean empty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	
	
	int front()
	{
		return head.data;
	}
	
	
	void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+"--");
			temp=temp.next;
		}
	}
	

	
}



public class Queue_u {

	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.push(5);
		q.push(8);
		q.push(9);
		q.display();
		

	}

}
