public class SelectionSort {
    /**
     * sort array of integers in increasing order.
     * @param nums array of integers
     */
    public static void sort(int[] nums) {
        if (nums == null) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int minIndex = findMinIndex(nums, i, nums.length);
            SortUtils.swap(nums, i, minIndex);
        }
    }

    /**
     * find the index of minimum in nums[start...end).
     * @param nums array of integers
     * @param start start index
     * @param end end index (exclusive)
     * @return index of minimum
     */
    private static int findMinIndex(int[] nums, int start, int end) {
        assert start < end;
        int min = nums[start];
        int index = start;
        for (int i = start; i < end; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
        }
        return index;
    }
}
