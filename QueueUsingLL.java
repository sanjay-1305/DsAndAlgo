package DsAlgo.Queue;

public class QueueUsingLL {
	Node front, rear;

	public QueueUsingLL() {

		this.front = this.rear = null;
	}

	class Node {
		int key;
		Node next;

		public Node(int k) {
			this.key = k;
			this.next = null;
		}
	}

	void enqueue(int key) {
		Node temp = new Node(key);
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
	}

	void dequeue() {
		if (this.front == null) {
			//System.out.println("queue is empty");
			return;
		}
		Node temp = this.front;
		this.front = this.front.next;
		if (this.front == null) {
			this.rear = null;
		}

	}

	public static void main(String[] args) {
		QueueUsingLL q = new QueueUsingLL();
		q.enqueue(10);
		q.enqueue(20);
		q.dequeue();
		q.dequeue();
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		System.out.println("Queue Front : " + q.front.key);
		System.out.println("Queue Rear : " + q.rear.key);
	}

}
