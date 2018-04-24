package queue;

import stack.ResizedArrayStack;

/**
 * 10.1-6
 */
public class TwoStacksQueue {
    private ResizedArrayStack in;
    private ResizedArrayStack out;
    private int size;

    public TwoStacksQueue() {
        in = new ResizedArrayStack();
        out = new ResizedArrayStack();
    }

    public void enqueue(int x) {
        in.push(x);
        size++;
    }

    public int dequeue() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        size--;
        return out.pop();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
