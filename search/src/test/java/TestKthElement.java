import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestKthElement {
    @Test
    public void ex9_2_4() {
        int[] nums = {3, 2, 9, 0, 7, 5, 4, 8, 6, 1};
        for (int i = 0; i < nums.length; i++) {
            assertEquals(i, KthElement.kthElement(nums, i + 1));
        }
    }

    @Test
    public void ex9_2_1() {
        int[] nums = {3, 2, 9, 0, 7, 5, 4, 8, 6, 1};
        for (int i = 0; i < nums.length; i++) {
            assertEquals(i, KthElement.kthElementIterable(nums, i + 1));
        }
    }
}
