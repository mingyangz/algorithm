package stack;

import java.util.Arrays;

public class ResizedArrayStack {
    private int[] stack;
    private int size;

    public ResizedArrayStack() {
        stack = new int[1];
        size = 0;
    }

    /**
     * Push an integer to the stack.
     * @param x int to be pushed
     */
    public void push(int x) {
        if (size == stack.length) {
            resizeArray(size * 2);
        }
        stack[size++] = x;
    }

    /**
     * Retrieve and remove the first element of the stack.
     * @return first element of the stack
     */
    public int pop() {
        int top = stack[--size];
        stack[size] = 0;
        if (size > 0 && size == stack.length / 4) {
            resizeArray(stack.length / 2);
        }
        return top;
    }

    private void resizeArray(int capacity) {
        int[] copy = new int[capacity];
        stack = Arrays.copyOf(stack, capacity);
    }

    /**
     * Size of the stack.
     * @return size of the stack
     */
    public int size() {
        return size;
    }

    /**
     * Return true if the stack is empty.
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
}
