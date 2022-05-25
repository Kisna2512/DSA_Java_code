package java_DSA;

import java.util.*;

class Heap
{
	public int [] arr=new int[100];
	int size;
	
	
	Heap()
	{
		arr[0]=-1;
		
		size=0;
	}
	
	
	public void insert(int val)
	{
		size=size+1;
		int index=size;
		arr[index]=val;
		
		while(index > 1)
		{
			int parent=index/2;
			if(arr[parent] < arr[index])
			{
				int temp=arr[parent];
				arr[parent]=arr[index];
				arr[index]=temp;
			}
			else
			{
				return;
			}
		}
		
	}
	
	public void deleteFromheap()
	{
		if(size==0)
		{
			System.out.println("Heap is Empty");
			return;
		}
		arr[1]=arr[size];
		size--;
		int i=1;
		while(i< size)
		{
			@SuppressWarnings("unused")
			int leftidx=2*i;
			@SuppressWarnings("unused")
			int rightidx=2*i+1;
			
			if(leftidx < size && arr[i] < arr[leftidx])
			{
				int temp=arr[leftidx];
				arr[leftidx]=arr[i];
				arr[i]=temp;
				
				i=leftidx;
		
			}
			else if(rightidx < size && arr[i] < arr[rightidx])
			{
				int temp=arr[rightidx];
				arr[rightidx]=arr[i];
				arr[i]=temp;
				
				i=rightidx;
			}
			else
			{
				return;
			}
			
		
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public void print()
	{
		for(int i=1;i<=size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
}


public class Heaps_Java {

	public static void main(String[] args) {

          Heap  h=new Heap();
          h.insert(2);
          h.insert(4);
          h.insert(5);
          h.insert(7);
          h.insert(3);
          h.insert(9);
//          h.deleteFromheap();
         
          h.print();
	}

}
