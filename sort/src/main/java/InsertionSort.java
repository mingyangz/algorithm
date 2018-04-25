public class InsertionSort {
    /**
     * sort array of integers in increasing order.
     * @param nums array of integers
     */
    public static void sort(int[] nums) {
        if (nums == null) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    SortUtils.swap(nums, j - 1, j);
                }
            }
        }
    }
}
