package stack;

import java.util.NoSuchElementException;

public class DoubleDropStack implements StackI {
    private Node first;
    private Node last;
    private int size;
    private int count;


    @Override
    public void push(Object element) {
        Node newNode = new Node();
        newNode.data = (String) element;

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        count++;
    }

    @Override
    public Object pop() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        Object element = last.data;
        last = last.prev;
        if (last == null) {
            first = null;

        } else {
            last.next = null;
        }
        count--;
        return element;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return last.data;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    public void dropOutStack() {
        if (count > 5) {
            first = first.next;
            first.prev = null;
            count--;


        }

    }

    class Node {
        public String data;
        public Node next;
        public Node prev;
    }
}
