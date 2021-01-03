package com.linkedlist;

public class Main {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(45);
		
		list.insertAny(15, 1);
		//list.deleteBeg();
		list.deleteEnd();
		list.show();

	}

}
