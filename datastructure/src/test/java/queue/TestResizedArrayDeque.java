package queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestResizedArrayDeque {
    @Test
    public void test1() {
        ResizedArrayDeque deque = new ResizedArrayDeque();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addFirst(5);
        deque.addLast(6);
        assertEquals(5, deque.removeFirst());
        assertEquals(2, deque.removeFirst());
        assertEquals(1, deque.removeFirst());
        assertEquals(3, deque.removeFirst());
        assertEquals(6, deque.removeLast());
        assertEquals(4, deque.removeLast());
    }
}
