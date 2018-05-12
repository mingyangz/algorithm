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

    /**
     * EX 2-4. Find the number of inversions in an array in range [low, high), brute force.
     * @param nums an array of integers
     * @return the number of inversions
     */
    public static int numberOfInversions(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
