package queue;

import stack.ResizedArrayStack;

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
    }

    public int dequeue() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
