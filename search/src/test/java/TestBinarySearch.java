import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinarySearch {
    @Test
    public void test1() {
        final int[] nums = new int[]{0, 1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            assertEquals(BinarySearch.binarySearch(nums, i), i);
        }
    }
}
