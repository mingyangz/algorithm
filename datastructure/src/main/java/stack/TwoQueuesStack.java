package stack;

import queue.ResizedArrayQueue;

/**
 * 10.1-7
 */
public class TwoQueuesStack {
    private ResizedArrayQueue firstQueue;
    private ResizedArrayQueue secondQueue;
    private int size;

    public TwoQueuesStack() {
        firstQueue = new ResizedArrayQueue();
        secondQueue = new ResizedArrayQueue();
        size = 0;
    }

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
