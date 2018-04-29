public class TwoSum {
    /**
     * check if there exists two elements in nums, s.t their sum is target
     * @param nums array of integers
     * @param target target value
     * @return true if there exists
     */
    public static boolean twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        MergeSort.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] + nums[high] == target) {
                return true;
            } else if (nums[low] + nums[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }
}
