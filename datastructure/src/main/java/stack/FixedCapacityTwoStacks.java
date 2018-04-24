package stack;

/**
 * 10.1-2
 */
public class FixedCapacityTwoStacks {
    private int[] stacks;
    private int firstStackSize;
    private int secondStackSize;

    /**
     * construct two stacks.
     * @param capacity size of array
     */
    public FixedCapacityTwoStacks(int capacity) {
        stacks = new int[capacity];
        firstStackSize = 0;
        secondStackSize = 0;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return firstStackSize + secondStackSize;
    }

    public void pushToFirstStack(int x) {
        stacks[firstStackSize++] = x;
    }

    public void pushToSecondStack(int x) {
        stacks[stacks.length - secondStackSize - 1] = x;
        secondStackSize++;
    }

    public int popFromFirstStack() {
        return stacks[--firstStackSize];
    }

    public int popFromSecondStack() {
        secondStackSize--;
        return stacks[stacks.length - secondStackSize - 1];
    }

}
