package stack;

import queue.ResizedArrayQueue;

/**
 * 10.1-7
 */
public class TwoQueuesStack {
    private ResizedArrayQueue firstQueue;
    private ResizedArrayQueue secondQueue;
    private int size;

    /**
     * construct stack.
     */
    public TwoQueuesStack() {
        firstQueue = new ResizedArrayQueue();
        secondQueue = new ResizedArrayQueue();
        size = 0;
    }

    /**
     * add item to stack.
     * @param x item
     */
    public void push(int x) {
        if (firstQueue.isEmpty()) {
            firstQueue.enqueue(x);
            while (!secondQueue.isEmpty()) {
                firstQueue.enqueue(secondQueue.dequeue());
            }
        } else {
            secondQueue.enqueue(x);
            while (!firstQueue.isEmpty()) {
                secondQueue.enqueue(firstQueue.dequeue());
            }
        }
        size++;
    }

    /**
     * retrieve and remove the first item.
     * @return item
     */
    public int pop() {
        size--;
        if (!firstQueue.isEmpty()) {
            return firstQueue.dequeue();
        } else {
            return secondQueue.dequeue();
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }
}
