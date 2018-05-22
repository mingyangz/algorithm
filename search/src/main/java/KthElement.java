public class KthElement {
    /**
     * Find kth element in an array.
     * @param nums a list of integers.
     * @param k k
     * @return kth element
     */
    public static int kthElement(int[] nums, int k) {
        return kthElement(nums, 0, nums.length, k);
    }

    private static int kthElement(int[] nums, int low, int high, int k) {
        if (low == high - 1) {
            return nums[low];
        }
        int p = partition(nums, low, high);
        if (p == k - 1) {
            return nums[p];
        } else if (p < k - 1) {
            return kthElement(nums, p + 1, high, k);
        } else {
            return kthElement(nums, low, p, k);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high - 1];
        int lt = low;
        for (int i = low; i < high; i++) {
            if (nums[i] <= pivot) {
                SortUtils.swap(nums, lt++, i);
            }
        }
        return lt - 1;
    }

    /**
     * Find kth element in an array without recursion.
     * @param nums a list of integers.
     * @param k k
     * @return kth element
     */
    public static int kthElementIterable(int[] nums, int k) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int p = partition(nums, low, high);
            if (p == k - 1) {
                return nums[p];
            } else if (p < k - 1) {
                low = p + 1;
            } else {
                high = p;
            }
        }
        return nums[low];
    }
}
