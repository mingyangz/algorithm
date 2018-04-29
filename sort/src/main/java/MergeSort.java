import java.util.Arrays;

public class MergeSort {
    /**
     * sort array of integers in increasing order.
     * @param nums array of integers
     */
    public static void sort(int[] nums) {
        mergeSort(nums, 0, nums.length);
    }

    /**
     * sort array of integers in range [start, end) to increasing order.
     * @param nums array of integers
     * @param start start index
     * @param end end index
     */
    private static void mergeSort(int[] nums, int start, int end) {
        if (start >= end - 1) {
            return;
        }
        final int mid = (start + end) >>> 1;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid, end);
        merge(nums, start, mid, end);
    }

    /**
     * merge two sorted array.
     * @param nums array of integers. [start, mid) is sorted. [mid, end) is sorted.
     * @param start start index
     * @param mid mid index
     * @param end end index
     */
    private static void merge(int[] nums, int start, int mid, int end) {
        int[] left = Arrays.copyOfRange(nums, start, mid);
        int[] right = Arrays.copyOfRange(nums, mid, end);
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = start; i < end; i++) {
            if (leftIndex >= left.length) {
                nums[i] = right[rightIndex++];
            } else if (rightIndex >= right.length) {
                nums[i] = left[leftIndex++];
            } else if (left[leftIndex] < right[rightIndex]) {
                nums[i] = left[leftIndex++];
            } else {
                nums[i] = right[rightIndex++];
            }
        }
    }
}
