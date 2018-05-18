public class QuickSort {
    /**
     * sort array of integers in increasing order.
     * @param nums array of integers
     */
    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        quickSort(nums, 0, nums.length);
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low >= high - 1) {
            return;
        }
        int less = low;
        int more = high - 1;
        int pivot = nums[high - 1];
        int index = low;
        while (index <= more) {
            if (nums[index] < pivot) {
                SortUtils.swap(nums, less++, index++);
            } else if (nums[index] > pivot) {
                SortUtils.swap(nums, more--, index);
            } else {
                index++;
            }
        }
        quickSort(nums, low, less);
        quickSort(nums, more + 1, high);
    }
}
