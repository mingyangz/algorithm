public class HeapSort {
    /**
     * sort array of integers in increasing order.
     * @param nums array of integers
     */
    public static void sort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        buildMaxHeap(nums);
        heapSort(nums);
    }

    private static void heapSort(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            SortUtils.swap(nums, i, 0);
            sink(nums, 0, i);
        }
    }

    private static void buildMaxHeap(int[] nums) {
        for (int i = nums.length / 2; i >= 0; i--) {
            sink(nums, i, nums.length);
        }
    }

    private static void sink(int[] nums, int i, int high) {
        while (i < high && leftChild(i) < high) {
            int index = leftChild(i);
            if (index + 1 < high && nums[index] < nums[index + 1]) {
                index++;
            }
            if (nums[i] < nums[index]) {
                SortUtils.swap(nums, i, index);
            }
            i = index;
        }
    }

    private static int leftChild(int i) {
        return 2 * (i + 1) - 1;
    }

    private static int parent(int i) {
        return (i - 1) / 2;
    }
}
