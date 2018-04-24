package queue;

public class LinkedListQueue {
    private class Node {
        int item;
        Node next;
    }

    private Node head;
    private Node tail;

    public LinkedListQueue() {
        head = null;
        tail = null;
    }

    /**
     * Add a item to the queue.
     * @param x item to be added.
     */
    public void enqueue(int x) {
        Node insert = new Node();
        insert.item = x;
        if (head == null) {
            head = insert;
            tail = insert;
        } else {
            tail.next = insert;
            tail = tail.next;
        }
    }

    /**
     * Retrieve and remove the first elements in the queue.
     * @return the first element in the queue
     */
    public int dequeue() {
        int item = head.item;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return item;
    }

    /**
     * Return true if the queue is empty.
     * @return true if the queue is empty
     */
    public boolean isEmpty() {
        return head == null;
    }
}
