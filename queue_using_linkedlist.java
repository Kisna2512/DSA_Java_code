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
	   if(head==null)
		{
			System.out.println("Queue is underflow");
		}
		head=head.next;
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
       System.out.println();
	}
	

	
}

public class Main
{
	public static void main(String[] args) {
	Queue q=new Queue();
		q.push(5);
		q.push(8);
		q.push(9);
		q.display();
		q.pop();
		q.display();
		
		System.out.println("Front of queue is:- "+q.front());
		if(q.empty())
		{
		    System.out.println("Queue is empty");
		}
		else
		{
		    System.out.println("Queue is not empty");
		}
	}
}
