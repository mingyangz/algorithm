package queue;

public class ResizedArrayDeque {
    private int[] deque;
    private int size;
    private int head;
    private int tail;

    /**
     * construct an empty deque.
     */
    public ResizedArrayDeque() {
        deque = new int[2];
        size = 0;
        head = 0;
        tail = 0;
    }

    /**
     * check if deque is empty.
     * @return true if deque is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * number of items on the deque.
     * @return number of items on the deque
     */
    public int size() {
        return size;
    }

    /**
     * add the item to the front.
     * @param x item
     */
    public void addFirst(int x) {
        if (size == deque.length) {
            resize(deque.length * 2);
        }
        if (head == -1) {
            head = deque.length - 1;
        }
        deque[head--] = x;
        size++;
    }

    /**
     * add the item to the end.
     * @param x item
     */
    public void addLast(int x) {
        if (size == deque.length) {
            resize(deque.length * 2);
        }
        if (tail == deque.length) {
            tail = 0;
        }
        deque[tail++] = x;
        size++;
    }

    /**
     * remove and return the item from the front.
     * @return item from the front
     */
    public int removeFirst() {
        if (size > 0 && size == deque.length / 4) {
            resize(deque.length / 2);
        }
        if (head == deque.length - 1) {
            head = -1;
        }
        return deque[++head];
    }

    /**
     * remove and return the item from the end.
     * @return item from the end
     */
    public int removeLast() {
        if (size > 0 && size == deque.length / 4) {
            resize(deque.length / 2);
        }
        if (tail == -1) {
            tail = deque.length;
        }
        return deque[--tail];
    }

    private void resize(int capacity) {
        int[] copy = new int[capacity];
        for (int i = 0; i < size; i++) {
            copy[i] = deque[(head + i + 1) % deque.length];
        }
        deque = copy;
        head = -1;
        tail = size;
    }
}
