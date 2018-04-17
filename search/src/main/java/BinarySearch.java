public class BinarySearch {
    /*
        Assume nums is sorted in increasing order
        return index of key in nums
        return -1 if key is not in nums
     */
    public static int binarySearch(int[] nums, int key) {
        return binarySearch(nums, 0, nums.length, key);
    }

    private static int binarySearch(int[] nums, int start, int end, int key) {
        rangeCheck(nums, start, end);
        int low = start;
        int high = end - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (nums[mid] == key)  {
                return mid;
            } else if (nums[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static void rangeCheck(int[] nums, int start, int end) {
        if (end > nums.length) {
            throw new ArrayIndexOutOfBoundsException(end);
        }
        if (start < 0) {
            throw new ArrayIndexOutOfBoundsException(end);
        }
        if (start >= end) {
            throw new IllegalArgumentException("start(" + start + ") > end(" + end + ")");
        }
    }
}
