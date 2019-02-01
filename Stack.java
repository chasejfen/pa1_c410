
class LinkList<T> {

	private static class Node<T> {

		private final T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> first = null;

	public void addFirst(T element) {
		Node<T> newFirst = new Node<T>(element);
		newFirst.next = first;
		first = newFirst;
	}

	public T removeFirst() {
		Node<T> oldFirst = first;
		first = first.next;
		return oldFirst.data;
	}

	public boolean isEmpty() {
		return first == null;
	}

}

public class Stack<T extends Comparable<? super T>> {
	private final LinkList<T> stackList = new LinkList<>();
	int capacity;
	int currentCapacity;
	T element;

	public Stack(int capacity) {
		this.capacity = capacity;
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		if (currentCapacity == capacity) {
			return true;
		} else
			return false;
	}

	public T peek() {
		return element;
	}

	public T pop() {
		currentCapacity--;
		return stackList.removeFirst();
	}

	public void push(T element) {
		this.element = element;
		stackList.addFirst(element);
		currentCapacity++;
	}
}
