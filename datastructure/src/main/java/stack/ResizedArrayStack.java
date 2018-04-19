package stack;

public class ResizedArrayStack {
    private int[] s;
    private int size;

    public ResizedArrayStack() {
        s = new int[1];
        size = 0;
    }

    /**
     * Push an integer to the stack.
     * @param x int to be pushed
     */
    public void push(int x) {
        if (size == s.length) {
            resizeArray(size * 2);
        }
        s[size++] = x;
    }

    /**
     * Retrieve and remove the first element of the stack.
     * @return first element of the stack
     */
    public int pop() {
        int top = s[--size];
        s[size] = 0;
        if (size >0 && size == s.length / 4) {
            resizeArray(s.length / 2);
        }
        return top;
    }

    private void resizeArray(int capacity) {
        int[] copy = new int[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = s[i];
        }
        s = copy;
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
