public class MaximumSubarray {
    /**
     * Linear time solution.
     * @param nums a list of integer
     * @return the max of a subarray
     */
    public static int maximumSubarray(int[] nums) {
        int max = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSoFar = Math.max(nums[i], maxSoFar + nums[i]);
            max = Math.max(maxSoFar, max);
        }
        return max;
    }

    /**
     * Divide and concur solution.
     * @param nums a list of integer
     * @return the max of a subarray
     */
    public static int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length);
    }

    private static int maxSubArray(int[] nums, int low, int high) {
        if (low >= high - 1) {
            return nums[low];
        }
        int mid = (low + high) >>> 1;
        int leftMax = maxSubArray(nums, low, mid);
        int rightMax = maxSubArray(nums, mid, high);
        int acrossMax = findAcrossMax(nums, low, mid, high);
        return Math.max(leftMax, Math.max(rightMax, acrossMax));
    }

    private static int findAcrossMax(int[] nums, int low, int mid, int high) {
        int leftMax = nums[mid];
        int sum = nums[mid];
        for (int i = mid - 1; i >= low; i--) {
            sum += nums[i];
            leftMax = Math.max(leftMax, sum);
        }
        int rightMax = nums[mid];
        sum = nums[mid];
        for (int i = mid + 1; i < high; i++) {
            sum += nums[i];
            rightMax = Math.max(rightMax, sum);
        }
        return leftMax + rightMax - nums[mid];
    }
}
