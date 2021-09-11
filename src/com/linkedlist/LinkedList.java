package com.linkedlist;

public class LinkedList {
	private Node head;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	/**
	 * method to insert node at the end
	 * 
	 * @param data
	 * @return
	 */
	public boolean addEnd(final int data) {
		boolean isAdded = false;

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			isAdded = true;

		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}
	/*
	 * method to print nodes in linked list
	 */

	public void print() {
		Node temp = head;
		System.out.println("Linkedlist ");
		while (temp.next != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print(temp.data + "-->null");
	}
}
