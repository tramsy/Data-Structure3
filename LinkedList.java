package com.linkedlist;

public class LinkedList 
{
	Node head;
	
	void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		
		if(head==null)
			head = node;
		else
		{
			Node n = head;
			while(n.next!=null)
				n = n.next;
			n.next = node;
		}
	}
	
	void insertAny(int data, int index)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		
		Node n = head;
		for(int i=0; i<index-1; i++)
		{
			n = n.next;
			
		}
		node.next = n.next;
		n.next = node;
			
	}
	
	void deleteBeg()
	{
		head = head.next;	
	}
	
	void deleteEnd()
	{
		Node node = new Node();
		Node n = head;
		while(n.next==null)
			n = n.next;
		n.next = node;
	}

	
	
	void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.print(node.data+ " ");
			node = node.next;
		}
		System.out.print(node.data+" ");
	}

}
