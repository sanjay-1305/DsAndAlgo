package DsAlgo.Stack;

public class StackUsingArray {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];

	boolean isEmpty() {
		return (top < 0);
	}

	StackUsingArray() {
		top = -1;
	}

	boolean push(int x) {
		if (top >= MAX - 1) {
			System.out.println("stack is overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into the stack");
			return true;
		}

	}

	int pop() {
		if (top < 0) {
			System.out.println("stack is underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;

		}
	}

	int peek() {
		if (top < 0) {
			System.out.println("stack is underflow");
			return 0;
		} else {
			int x = a[top];
			return x;

		}
	}

	void Element() {
		int i = 0;
		while (i <= top) {
			System.out.println(a[i]);
			i++;
		}
	}

	public static void main(String[] args) {
		StackUsingArray st = new StackUsingArray();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.pop() + " Popped from stack");
		System.out.println("top element of stack is " + st.peek());
		st.Element();
	}

}
