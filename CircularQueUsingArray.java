package DsAlgo.Queue;

import java.util.ArrayList;

public class CircularQueUsingArray {
	private int size, front, rear;
	private ArrayList<Integer> queue = new ArrayList<Integer>();

	CircularQueUsingArray(int size) {
		this.size = size;
		this.front = this.rear = -1;
	}

	public void enQueue(int data) {
		if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
			System.out.println("circular queue is full");
		} else if (front == -1) {
			front = 0;
			rear = 0;
			queue.add(rear, data);

		} else if (rear == size - 1 && front != 0) {
			rear = 0;
			queue.set(rear, data);
		}
		else
		{
			rear = (rear + 1);

			// Adding a new element if
			if (front <= rear) {
				queue.add(rear, data);
			}

			// Else updating old value
			else {
				queue.set(rear, data);
			}
		}
	}

	public int deQueue() {
		int temp;
		if (front == -1) {
			System.out.println("queue is empty");
			return -1;
		}
		temp = queue.get(front);
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == size - 1) {
			front = 0;
		} else {
			front = front + 1;
		}
		return temp;
	}

	public void displayQueue() {
		if (front == -1) {
			System.out.print("queue is empty");
			return;
		}
		System.out.print("Elements in the circular queue are ");
		if (rear >= front) {
			for (int i = front; i <=rear; i++) {
				System.out.print(queue.get(i) + " ");

			}
			System.out.println();
		} else {
			for (int i = front; i < size; i++) {
				System.out.print(queue.get(i) + " ");

			}
			for (int i = 0; i <=rear; i++) {
				System.out.print(queue.get(i) + " ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		CircularQueUsingArray q = new CircularQueUsingArray(5);
		q.enQueue(14);
		q.enQueue(22);
		q.enQueue(13);
		q.enQueue(-6);

		q.displayQueue();
		int x = q.deQueue();
		 
	    // Checking for empty queue.
	    if(x != -1)
	    {
	        System.out.print("Deleted value = ");
	        System.out.println(x);
	    }
	 
	    x = q.deQueue();
	 
	    // Checking for empty queue.
	    if(x != -1)
	    {
	        System.out.print("Deleted value = ");
	        System.out.println(x);
	    }
	 
	    q.displayQueue();
	     
	    q.enQueue(9);
	    q.enQueue(20);
	    q.enQueue(5);
	     
	    q.displayQueue();
	     
	    q.enQueue(20);
	}
}
