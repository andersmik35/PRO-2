package queueopgaver;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a array.
 */
public class ArrayQueue implements QueueI {
	private int capacity;
	private Object[] array;
	private int head;
	private int tail;
	private int size;



	/**
	 * Constructs an empty queue.
	 */
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		array = new Object[capacity];
		head = 0;
		tail = 0;
		size = 0;

	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement
	 *            the element to add
	 */
	@Override
	public void enqueue(Object newElement) {
		if (size == capacity) {
			throw new IllegalStateException("Queue is full");
		}
		array[tail] = newElement;
		tail = (tail + 1) % capacity;
		size++;
	}

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	@Override
	public Object dequeue() {
		if(isEmpty()){
			throw new NoSuchElementException("Queue is empty");
		}
		Object removed = array[head];
		head = (head + 1) % capacity;
		size--;
		return removed;
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 *
	 * @return the head element
	 */
	@Override
	public Object getFront() {
		if(isEmpty()){
			throw new NoSuchElementException("Queue is empty");
		}
		return array[head];
	}

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {
		return size;
	}
}
