package DsAlgo.LinkList;

public class DoublyLinkedList {
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void push(int newdata) {
		Node newnode = new Node(newdata);
		newnode.next = head;
		newnode.prev = null;
		
		if (head != null) {
			head.prev = newnode;
		}
		head = newnode;
	}

	public void insertAfter(Node prevnode, int newdata) {

		if (prevnode == null) {
			System.out.println("The previous node cant be null");
			return;
		}
		Node newnode = new Node(newdata);
		newnode.next = prevnode.next;
		
		prevnode.next = newnode;
		newnode.prev = prevnode;

		if (newnode.next != null) {
			newnode.next.prev = newnode;
		}
	}

	public void append(int data) {
		Node newnode = new Node(data);
		Node last = head;
		newnode.next = null;
		if (head == null) {

			newnode.prev = null;
			head = newnode;
			return;
		}
		while (last.next != null) {
			last = last.next;

		}
		last.next = newnode;
		newnode.prev = last;
	}

	public void printList(Node CurrNode) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (CurrNode != null) {
			System.out.print(CurrNode.data + " ");
			last = CurrNode;
			CurrNode = CurrNode.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.push(39);
		dll.push(38);
		dll.push(36);
		dll.push(35);
		dll.append(34);
		dll.insertAfter(dll.head.next, 37);
		System.out.println("Created DLL is: ");
		dll.printList(dll.head);

	}
}
