package DsAlgo.Queue;

public class CircularQueUsingLL {
	static class Node {
		int data;
		Node next;
	}

	static class Queue {
		Node front, rear;
	}

	static void enQueue(Queue queue, int value) {
		Node temp = new Node();
		temp.data = value;
		if (queue.front == null) {
			queue.front = temp;
		} else {
			queue.rear.next = temp;
		}
		queue.rear = temp;
		queue.rear.next = queue.front;
	}

	static int deQueue(Queue q) {
		if (q.front == null) {
			System.out.printf("Queue is empty");
			return Integer.MIN_VALUE;
		}
		int value;
		if (q.front == q.rear) {
			value = q.front.data;
			q.front = null;
			q.rear = null;

		} else {
			Node temp = q.front;
			value = temp.data;
			q.front = q.front.next;
			q.rear.next = q.front;
		}
		return value;
	}

	static void displayQueue(Queue q) {
		Node temp = q.front;
		System.out.printf("\nElements in Circular Queue are: ");
		while (temp.next != q.front) {
			System.out.printf("%d ", temp.data);
			temp = temp.next;
		}
		System.out.printf("%d", temp.data);
	}

	public static void main(String args[]) {
		// Create a queue and initialize front and rear
		Queue q = new Queue();
		q.front = q.rear = null;

		// Inserting elements in Circular Queue
		enQueue(q, 14);
		enQueue(q, 22);
		enQueue(q, 6);

		// Display elements present in Circular Queue
		displayQueue(q);

		// Deleting elements from Circular Queue
		System.out.printf("\nDeleted value = %d", deQueue(q));
		System.out.printf("\nDeleted value = %d", deQueue(q));

		// Remaining elements in Circular Queue
		displayQueue(q);

		enQueue(q, 9);
		enQueue(q, 20);
		displayQueue(q);
	}

}
