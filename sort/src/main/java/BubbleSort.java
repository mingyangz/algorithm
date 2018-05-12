public class BubbleSort {
    /**
     * sort array of integers in increasing order.
     * @param nums array of integers
     */
    public static void sort(int[] nums) {
        if (nums == null) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    SortUtils.swap(nums, j, j - 1);
                }
            }
        }
    }
}
