import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestTwoSum {
    @Test
    public void ex2_3_7() {
        int[] nums = {3, 6, 9, 23, 45, 51};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                assertTrue(TwoSum.twoSum(nums, nums[i] + nums[j]));
            }
        }
        assertFalse(TwoSum.twoSum(nums, 1));
    }
}
