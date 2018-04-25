public class SortUtils {
    /**
     * swap two numbers in an array.
     * @param nums array of integers
     * @param first first index
     * @param second second index
     */
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
