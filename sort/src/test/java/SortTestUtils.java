public class SortTestUtils {
    /**
     * check if an array of integers in increasing order.
     * @param nums array of integers
     * @return true if sorted
     */
    public static boolean isSorted(int[] nums) {
        if (nums == null) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * check if an array of integers in decreasing order.
     * @param nums array of integers
     * @return true if sorted
     */
    public static boolean isReversedSorted(int[] nums) {
        if (nums == null) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }
}
