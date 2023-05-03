package queueopgaver;

import java.util.NoSuchElementException;

public class LinkedQueue implements QueueI {

    private Node head;
    private Node tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
    }




    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(Object newElement) {
        Node newNode = new Node(newElement);
        if (isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        Object data = head.data;
        head = head.next;
        size--;
        if (isEmpty()){
            tail = null;
        }
        return data;
    }

    @Override
    public Object getFront() {
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return head.data;
    }

    @Override
    public int size() {
        return size;
    }

    class Node{
        public Object data;
        public Node next;

        public Node(Object data){
            this.data = data;
            this.next = next;
        }

    }
}
