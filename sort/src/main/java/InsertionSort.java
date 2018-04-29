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
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                SortUtils.swap(nums, j - 1, j);
                j--;
            }
        }
    }

    /**
     * sort array of integers in decreasing order.
     * @param nums array of integers
     */
    public static void reversedSort(int[] nums) {
        if (nums == null) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j] > nums[j - 1]) {
                SortUtils.swap(nums, j - 1, j);
                j--;
            }
        }
    }

    /**
     * sort array of integers in increasing order recursively.
     * @param nums array of integers
     */
    public static void recursiveSort(int[] nums) {
        recursiveSort(nums, nums.length);
    }

    /**
     * sort array of integers in increasing order recursively in range [0, end).
     * @param nums array of integers
     */
    private static void recursiveSort(int[] nums, int end) {
        if (end == 1) {
            return;
        }
        recursiveSort(nums, end - 1);
        int curr = end - 1;
        while (curr > 0 && nums[curr] < nums[curr - 1]) {
            SortUtils.swap(nums, curr - 1, curr);
            curr--;
        }
    }
}
