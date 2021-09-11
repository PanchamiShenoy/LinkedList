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
	 * method to insert node at the end.Uc3 inserting node at end
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

	/**
	 * method to node at head or insert node front
	 * 
	 * @param data
	 */
	public void addFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	/**
	 * to insert node at specified position
	 * 
	 * @param pos
	 * @param data
	 */
	public void addAtPosition(int pos, int data) {
		if (pos <= 0) {
			System.out.println("Invalid position");
			return;
		} else if (pos == 1) {
			addFront(data);
		} else {
			int count = 1;
			Node newNode = new Node(data);
			Node cur = head;
			Node prev = null;
			while (count < pos) {
				prev = cur;
				cur = cur.next;
				count++;
			}
			newNode.next = cur;
			prev.next = newNode;
		}

	}
}
