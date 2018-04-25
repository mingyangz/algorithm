package queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestQueue {
    @Test
    public void testResizedArrayQueue() {
        ResizedArrayQueue queue = new ResizedArrayQueue();
        queue.enqueue(4);
        queue.enqueue(1);
        queue.enqueue(3);
        assertEquals(4, queue.dequeue());
        queue.enqueue(8);
        assertEquals(1, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(8, queue.dequeue());
    }

    @Test
    public void testLinkedListQueue() {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(4);
        queue.enqueue(1);
        queue.enqueue(3);
        assertEquals(4, queue.dequeue());
        queue.enqueue(8);
        assertEquals(1, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(8, queue.dequeue());
    }

    @Test
    public void testTwoStackQueue() {
        TwoStacksQueue queue = new TwoStacksQueue();
        queue.enqueue(4);
        queue.enqueue(1);
        queue.enqueue(3);
        assertEquals(4, queue.dequeue());
        queue.enqueue(8);
        assertEquals(1, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(8, queue.dequeue());
    }
}
