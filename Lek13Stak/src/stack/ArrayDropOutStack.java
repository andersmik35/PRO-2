package stack;

public class ArrayDropOutStack implements StackI {


    //TODO: Implement the ArrayDropOutStack class
    private Object [] stack;
    private int top;
    private int count;



    public ArrayDropOutStack(int capacity){
        stack = new Object[capacity];
        top = -1;
        count = 0;
    }


    @Override
    public void push(Object element) {
        top++;
        stack[top] = element;

    }

    @Override
    public Object pop() {
        return null;
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
            removeStack();

        }

    }
    public void removeStack(){
        if (top == 5){
            top = 0;
        }

    }
}
