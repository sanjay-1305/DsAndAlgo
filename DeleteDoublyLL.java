package DsAlgo.LinkList;

import DsAlgo.LinkList.DoublyLinkedList.Node;

public class DeleteDoublyLL {
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
	 public void printlist(Node node)
	    {
	        Node last = null;
	 
	        while (node != null) {
	            System.out.print(node.data + " ");
	            last = node;
	            node = node.next;
	        }
	 
	        System.out.println();
	    }
	 void deleteNode(Node del) {
		 if (head==null|| del==null) {
			return;
		}
		 if (head==del) {
			head =del.next;
		}
		// Change next only if node to be deleted
	        // is NOT the last node
	        if (del.next != null) {
	            del.next.prev = del.prev;
	        }
	 
	        // Change prev only if node to be deleted
	        // is NOT the first node
	        if (del.prev != null) {
	            del.prev.next = del.next;
	        }
		 return;
	 }
	public static void main(String[] args) {
		
		DeleteDoublyLL Dedll=new DeleteDoublyLL();
		
		Dedll.push(2);
		
		Dedll.push(6);
		Dedll.push(7);
		Dedll.push(8);
		Dedll.push(9);
		System.out.print("Created DLL is: ");
		Dedll.printlist(Dedll.head);
		Dedll.deleteNode(Dedll.head);
		 System.out.print("\nList after deleting first node: ");
		 Dedll.printlist(Dedll.head);
	 
	        // Deleting middle node from 8->4->2
		 Dedll.deleteNode(Dedll.head.next);
	 
	        System.out.print("\nList after Deleting middle node: ");
	        Dedll.printlist(Dedll.head);
		
		
	}

}
