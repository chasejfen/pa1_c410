
public class VipQueue<T extends Comparable<? super T>> {
	private Queue<T> queue;
	private Stack<T> stack;
	private int count = 0;

	public VipQueue(int capacity) {
		queue = new Queue<T>(capacity / 2);
		stack = new Stack<T>(capacity / 2);
	}

	public boolean isEmpty() {
		if (queue.isEmpty() && stack.isEmpty())
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (queue.isFull() && stack.isFull())
			return true;
		else
			return false;
	}

	public T peek() {
		if (!stack.isEmpty())
			return stack.peek();
		else if (!queue.isEmpty())
			return queue.peek();
		else
			return null;
	}

	public T dequeue() {
		if (!stack.isEmpty()) {
			count--;
			return stack.pop();
		} else {
			count--;
			return queue.dequeue();
		}
	}

	public void enqueue(T element) {
		if (isFull())
			return;
		else
			count++;
		queue.enqueue(element);
	}

	public void vipEnqueue(T element) {
		if (isFull())
			return;
		else
			count++;
		stack.push(element);

	}

	public int count() {
		return count;
	}
}
