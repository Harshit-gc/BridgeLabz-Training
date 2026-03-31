package review;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	static Node addFirst(Node head, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}
		newNode.next = head;
		return newNode;
	}

	static Node addLast(Node head, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return head;
	}

	static Node addMiddle(Node head, int index, int data) {
		Node newNode = new Node(data);
		Node temp = head;
		for (int i = 0; i < index - 2; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}

	static Node deleteFirst(Node head) {
		if (head == null) {
			System.out.println("List Is Empty");
		}
		if (head.next == null) {
			return null;
		}
		return head.next;
	}

	static Node deleteLast(Node head) {
		if (head == null) {
			System.out.println("List Is Empty");
		}
		if (head.next == null) {
			return null;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}

	static Node deleteMiddle(Node head, int index) {
		Node temp = head;
		for (int i = 0; i < index - 2; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
	}

	static void printLL(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = null;
		head = addFirst(head, 2);
		head = addFirst(head, 1);
		head = addLast(head, 3);
		head = addMiddle(head, 3, 4);
		printLL(head);
		// head = deleteFirst(head);
		// head = deleteLast(head);
		head = deleteMiddle(head, 3);
		printLL(head);
	}
}
