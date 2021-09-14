package com.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.addEnd(100);
		l.addEnd(200);
		l.addEnd(400);
		l.addEnd(500);
		l.addAtPosition(3, 300);
		l.insertAfter(400, 450);
		l.print();
		l.deleteSpecified(450);
		l.print();

		SortedList sl = new SortedList();
		System.out.println("\nOrdered Linked List");
		sl.add(50);
		sl.add(20);
		sl.add(80);
		sl.add(30);
		sl.print();
	}

}
