package stack;

import java.util.NoSuchElementException;

public class ArrayDropOutStack implements StackI {

    private Object [] stack;
    private int top;
    private int count;
    private int capacity;



    public ArrayDropOutStack(int capacity){
        this.capacity = capacity;
        stack = new Object[capacity];
        top = -1;
        count = 0;
    }


    @Override
    public void push(Object element) {
        top++;
        if (top >= capacity){
            top = 0;
        }
        stack[top] = element;
        if (count < capacity){
            count++;
        }

    }

    @Override
    public Object pop() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        Object element = stack[top];
        stack[top] = null;
        top--;
        if (top < 0){
            top = capacity - 1;
        }
        count--;
        return element;
    }

    @Override
    public Object peek() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    public void dropOutStack(){
        while (count >= capacity){
            pop();

        }

    }
    /*public void removeStack(){
        if (top == 5){
            top = 0;
        }

    }*/
}
