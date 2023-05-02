package queueopgaver;

import java.util.NoSuchElementException;

public class DoubleLinkedQueue implements DequeI{

    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedQueue(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(Object newElement) {
        Node newNode = new Node(newElement);
        if (isEmpty()){
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;

    }

    @Override
    public void addLast(Object newElement) {
        Node newNode = new Node(newElement);
        if (isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        size++;

    }

    @Override
    public Object removeFirst() {
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        Object removedData = head.data;
        if (head == tail){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        size--;
        return removedData;
    }

    @Override
    public Object removeLast() {
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        Object removedData = tail.data;
        if (head == tail){
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        size--;
        return removedData;
    }

    @Override
    public Object getHead() {
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return head.data;
    }

    @Override
    public Object getTail() {
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return tail.data;
    }

    @Override
    public int size() {
        return size;
    }

    class Node{
        public Object data;
        public Node next;
        public Node previous;

        public Node(Object data){
            this.data = data;
            this.next = head;
            this.previous = tail;
        }
    }

}
