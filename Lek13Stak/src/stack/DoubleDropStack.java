package stack;

import java.util.NoSuchElementException;

public class DoubleDropStack implements StackI {
    private Node first;
    private Node last;
    private int size;
    private int count;


    @Override
    public void push(Object element) {
        first = null;
        last = null;


    }

    @Override
    public Object pop() {
        if (first == null){
            throw new NoSuchElementException();
        }
        Object element = first.data;
        first = first.next;
        count--;
        return element;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    public void dropOutStack(){
        if (count > 5){
            first = first.next;
            count--;


        }

    }
    class Node {
        public String data;
        public Node next;
        public Node prev;
    }
}
