package stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStack {
    @Test
    public void testResizedArrayStack() {
        ResizedArrayStack stack = new ResizedArrayStack();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        assertEquals(3, stack.pop());
        stack.push(8);
        assertEquals(8, stack.pop());
        assertEquals(1, stack.pop());
        assertEquals(4, stack.pop());
    }

    @Test
    public void testLinkedListStack() {
        LinkedListStack stack = new LinkedListStack();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        assertEquals(3, stack.pop());
        stack.push(8);
        assertEquals(8, stack.pop());
        assertEquals(1, stack.pop());
        assertEquals(4, stack.pop());
    }

    @Test
    public void testTwoQueuesStack() {
        TwoQueuesStack stack = new TwoQueuesStack();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        assertEquals(3, stack.pop());
        stack.push(8);
        assertEquals(8, stack.pop());
        assertEquals(1, stack.pop());
        assertEquals(4, stack.pop());
    }
}
