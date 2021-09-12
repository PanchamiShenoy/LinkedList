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

	/**
	 * delete the node from front position
	 */
	public void deleteAtHead() {
		Node temp = head;
		if (head == null) {
			System.out.println("No node to delete");
		} else {
			head = head.next;
			System.out.println("\n" + temp.data + "is deleted");
			temp = null;
		}
	}

	/**
	 * to delete last node from linkedlist
	 */
	public void deleteAtTail() {
		Node temp = head;
		Node cur = temp;
		if (head == null) {
			System.out.println("Deletion not possible");
			return;
		} else {
			while (temp.next != null) {
				cur = temp;
				temp = temp.next;
			}
			System.out.println("\n" + temp.data + "is deleted");
			cur.next = null;
		}
	}

	/**
	 * 
	 * search for specific node
	 * 
	 * @param key
	 * @return
	 */
	public Node search(int key) {
		Node tempNode = head;
		int count = 0;
		while (tempNode != null) {
			count++;
			if (tempNode.data == key) {
				System.out.println(key + "is at " + count + "th position");
				return tempNode;
			}
			tempNode = tempNode.next;

		}
		return null;
	}

	public void insertAfter(int key, int data) {
		Node newNode = new Node(data);
		Node temp = search(key);
		Node next = temp.next;
		temp.next = newNode;
		newNode.next = next;
	}
}
