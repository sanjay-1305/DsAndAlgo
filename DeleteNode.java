package DsAlgo.LinkList;

import DsAlgo.LinkList.LinkedList.Node;

public class DeleteNode {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	void deleteNode(int key) {
		Node temp=head,prev=null;
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return;
		}
		while (temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==null) {
			return;
		}
		prev.next=temp.next;
	}
	//inserting from head
	 public void push(int data) {
		 Node newNode=new Node(data);
		 newNode.next=head;
		 head=newNode;
	 }
	 public void printList() {
		 Node tnode = head;
		 while (tnode!=null) {
			System.out.print(tnode.data+" ");
			tnode=tnode.next;
		}
	 }
	 void deleteNodeByIndex(int position)
	    {
	        // If linked list is empty
	        if (head == null)
	            return;
	 
	        // Store head node
	        Node temp = head;
	 
	        // If head needs to be removed
	        if (position == 0)
	        {
	            head = temp.next;   // Change head
	            return;
	        }
	 
	        // Find previous node of the node to be deleted
	        for (int i=0; temp!=null && i<position-1; i++)
	            temp = temp.next;
	 
	        // If position is more than number of nodes
	        if (temp == null || temp.next == null)
	            return;
	 
	        // Node temp->next is the node to be deleted
	        // Store pointer to the next of node to be deleted
	        Node next = temp.next.next;
	 
	        temp.next = next;  // Unlink the deleted node from list
	    }
	 
	public static void main(String[] args) {
		DeleteNode llist = new DeleteNode();
		 
	        llist.push(7);
	        llist.push(1);
	        llist.push(3);
	        llist.push(2);
	        llist.push(10);
	        llist.push(20);
	        llist.push(21);
	 
	        System.out.println("\nCreated Linked list is:");
	        llist.printList();
	 
	        llist.deleteNode(1); 
	        //delete the node by index
	        llist.deleteNodeByIndex(3);
	 
	        System.out.println(
	            "\nLinked List after Deletion of 1:");
	        llist.printList();

	}

}
