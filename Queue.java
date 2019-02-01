
public class Queue<T> {
	private int capacity;
	int front = -1;
	int rear = -1;
	T[] queueArray;

	@SuppressWarnings("unchecked")
	public Queue(int capacity) {
		this.capacity = capacity;
		queueArray = (T[]) new Object[capacity];
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1)
			return true;
		else
			return false;

	}

	public boolean isFull() {
		if (rear == capacity - 1)
			return true;
		else
			return false;

	}

	public T peek() {
		return queueArray[front];

	}

	public T dequeue() {
		T value = null;
		if (front == rear) {
			value = queueArray[front];
			front = -1;
			rear = -1;

		} else {
			value = queueArray[front];
			front = (front + 1) % capacity;

		}
		return value;
	}

	public void enqueue(T element) {
		if (isFull()) {
			return;
		} else if (isEmpty()) {
			front++;
			rear++;
			queueArray[(rear)] = element;
		} else {
			rear = (rear + 1) % capacity;
			queueArray[rear] = element;
		}
	}
}
