package queue;

public class ResizedArrayQueue {
    private int[] queue;
    private int size;
    private int head;
    private int tail;

    /**
     * Constructor.
     */
    public ResizedArrayQueue() {
        queue = new int[2];
        size = 0;
        head = 0;
        tail = 0;
    }

    /**
     * Add a item to the queue.
     * @param x item to be added.
     */
    public void enqueue(int x) {
        if (size == queue.length) {
            resizeArray(size * 2);
        }
        queue[tail++] = x;
        if (tail == queue.length) {
            tail = 0;
        }
        size++;
    }

    /**
     * Retrieve and remove the first elements in the queue.
     * @return the first element in the queue
     */
    public int dequeue() {
        final int item = queue[head++];
        size--;
        if (head == queue.length) {
            head = 0;
        }
        if (size > 0 && size == queue.length / 4) {
            resizeArray(queue.length / 2);
        }
        return item;
    }

    private void resizeArray(int capacity) {
        int[] copy = new int[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = queue[(head + i) % queue.length];
        }
        queue = copy;
        head = 0;
        tail = size;
    }

    /**
     * Return true if the queue is empty.
     * @return true if the queue is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
}
