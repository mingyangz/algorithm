import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEx {
    @Test
    public void ex2_1_3() {
        int[] nums = {3, 1, 2, 6, 7, 8, 8, 1, 2, 5};
        assertEquals(2, Exercise.findIndexOfTarget(nums, 2));
        assertEquals(-1, Exercise.findIndexOfTarget(nums, 10));
    }

    @Test
    public void ex2_1_4() {
        int[] first = {1, 1, 1};
        int[] second = {1, 0, 1};
        int[] sum = Exercise.addBinary(first, second);
        assertEquals(4, sum.length);
        assertEquals(1, sum[0]);
        assertEquals(1, sum[1]);
        assertEquals(0, sum[2]);
        assertEquals(0, sum[3]);
    }
}
