package stack;

import java.util.NoSuchElementException;

public class EnkeltKaedeStack implements StackI {
    private Node first;

    private int count;

    public EnkeltKaedeStack() {
        first = null;
    }


    @Override
    public void push(Object element) {
        dropOutStack();
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        count++;

    }

    @Override
    public Object pop() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        Object element = first.data;
        first = first.next;
        count--;
        return element;

    }

    @Override
    public Object peek() {
        if (first != null) {
            return first.data;
        } else
            throw new NoSuchElementException(
                    "peek: Stack is empty");
    }

    @Override
    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else
            return false;
    }

    @Override
    public int size() {
        int count = 0;
        Node position = first;
        while (position != null) {
            count++;
            position = position.next;
        }
        return count;
    }

    public void dropOutStack() {
        if (count > 5){
            first = first.next;
            count--;

        }



    }

    class Node {
        public Object data;
        public Node next;
    }
}
