package com.linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.addEnd(100);
		l.addEnd(200);
		l.addEnd(400);
		l.addEnd(500);
		l.addAtPosition(3,300);
		l.print();
		l.deleteAtHead();
		l.print();
		l.deleteAtTail();
		l.print();
	}

}
