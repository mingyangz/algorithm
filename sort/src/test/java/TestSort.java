import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSort {
    @Test
    public void testSelectionSort() {
        int[] nums = {9, 4, 3, 2, 1, 6};
        SelectionSort.sort(nums);
        assertTrue(SortTestUtils.isSorted(nums));
    }

    @Test
    public void testInsertionSort() {
        int[] nums = {9, 4, 3, 2, 1, 6};
        InsertionSort.sort(nums);
        assertTrue(SortTestUtils.isSorted(nums));
    }
}
