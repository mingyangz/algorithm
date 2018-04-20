package stack;

/**
 * LinkedList implementation of Stack of Integers.
 */
public class LinkedListStack {
    /**
     * LinkedList Node.
     */
    private class Node {
        int val;
        Node next;
    }

    private Node head;
    private int size;

    public LinkedListStack() {
        head = null;
        size = 0;
    }

    /**
     * Push an integer to the stack.
     * @param x int to be pushed
     */
    public void push(int x) {
        Node newHead = new Node();
        newHead.val = x;
        newHead.next = head;
        head = newHead;
        size++;
    }

    /**
     * Retrieve and remove the first element of the stack.
     * @return first element of the stack
     */
    public int pop() {
        int top = head.val;
        head = head.next;
        size--;
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
        return head == null;
    }
}
