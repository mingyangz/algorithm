package queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class TestPriorityQueue {
    @Test
    public void ex6_5_1() {
        int[] nums = {15, 13, 9, 5, 12, 8, 7, 4, 0, 6, 2, 1};
        BinaryHeapPriorityQueue queue = new BinaryHeapPriorityQueue(nums.length);
        for (int i = 0; i < nums.length; i++) {
            queue.insert(nums[i]);
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            assertEquals(nums[i], queue.deleteMax());
        }
        assertTrue(queue.isEmpty());
    }
}
