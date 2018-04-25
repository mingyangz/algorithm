import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSelectionSort {
    @Test
    public void test1() {
        int[] nums = {9, 4, 3, 2, 1, 6};
        SelectionSort.sort(nums);
        assertTrue(SortTestUtils.isSorted(nums));
    }
}
