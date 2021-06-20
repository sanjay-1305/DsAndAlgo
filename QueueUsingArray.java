package DsAlgo.Queue;

import java.util.Iterator;

public class QueueUsingArray {
	private static int front, rear, capacity;
	private static int queue[];

	QueueUsingArray(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}

	static void queueEnqueue(int data) {
		if (capacity == rear) {
			System.out.println("Queue is full");
			return;
		} else {
			queue[rear] = data;
			rear++;
		}
		return;
	}

	static void queueDequeue() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return;
		} else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];

			}
			if (rear < capacity) {
				queue[rear] = 0;

			}
			rear--;
		}
		return;
	}

	static void queueDisplay() {
		int i;
		if (front == rear) {
			System.out.println("queue is empty");
			return;
		}
		for (i = front; i < rear; i++) {

			System.out.print(queue[i] + " ");
		}
		System.out.println();
		return;
	}

	static void queueFront() {
		if (front == rear) {
			System.out.println("queue is empty");
			return;
		}
		System.out.println("front is " + queue[front]);
		return;
	}

	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray(6);
		q.queueDisplay();
		q.queueEnqueue(20);
		q.queueEnqueue(30);
		q.queueEnqueue(40);
		q.queueEnqueue(50);
		q.queueEnqueue(60);
		q.queueEnqueue(70);
		q.queueDisplay();

		q.queueDequeue();
		q.queueDequeue();
		System.out.printf("\n\nafter two node deletion\n\n");

		// print Queue elements
		q.queueDisplay();

		// print front of the queue
		q.queueFront();

	}

}
