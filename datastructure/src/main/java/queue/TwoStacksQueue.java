package queue;

import stack.ResizedArrayStack;

/**
 * 10.1-6
 */
public class TwoStacksQueue {
    private ResizedArrayStack in;
    private ResizedArrayStack out;
    private int size;

    /**
     * construct a queue.
     */
    public TwoStacksQueue() {
        in = new ResizedArrayStack();
        out = new ResizedArrayStack();
    }

    /**
     * add an item to queue.
     * @param x item
     */
    public void enqueue(int x) {
        in.push(x);
        size++;
    }

    /**
     * retrieve and return the first item in queue.
     * @return item
     */
    public int dequeue() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        size--;
        return out.pop();
    }

    /**
     * check if queue is empty.
     * @return true if empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
}
