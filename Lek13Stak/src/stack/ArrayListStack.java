package stack;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI{

    private ArrayList<Object> stack;

    private int top;

    public ArrayListStack(){
        stack = new ArrayList<>();
        top = -1;
    }

    @Override
    public void push(Object element) {
        stack.add(element);
        top++;
    }

    @Override
    public Object pop() {
        if (top < 0){
            throw new NoSuchElementException();
        }
        Object element = stack.get(top);
        stack.remove(top);
        top--;
        return element;
    }

    @Override
    public Object peek() {
        if (top < 0){
            throw new NoSuchElementException();
        }
        return stack.get(top);
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}
