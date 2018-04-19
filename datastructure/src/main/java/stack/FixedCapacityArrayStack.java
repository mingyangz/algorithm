package stack;

public class FixedCapacityArrayStack {
    private int[] s;
    private int size;

    public FixedCapacityArrayStack(int capacity) {
        s = new int[capacity];
        size = 0;
    }

    /**
     * Push an integer to the stack.
     * @param x int to be pushed
     */
    public void push(int x) {
        s[size++] = x;
    }

    /**
     * Retrieve and remove the first element of the stack.
     * @return first element of the stack
     */
    public int pop() {
        int top = s[--size];
        return top;
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
