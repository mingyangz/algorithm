package stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFixedCapacityTwoStacks {
    @Test
    public void test1() {
        FixedCapacityTwoStacks stacks = new FixedCapacityTwoStacks(4);
        stacks.pushToFirstStack(1);
        stacks.pushToSecondStack(2);
        stacks.pushToSecondStack(3);
        stacks.pushToFirstStack(4);
        assertEquals(3, stacks.popFromSecondStack());
        assertEquals(2, stacks.popFromSecondStack());
        assertEquals(4, stacks.popFromFirstStack());
        assertEquals(1, stacks.popFromFirstStack());
    }
}
