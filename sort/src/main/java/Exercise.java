import java.util.Arrays;

public class Exercise {
    /**
     * Find index of target.
     * @param nums array of integers
     * @param target target
     * @return the index of target. -1 if target is not in array
     */
    public static int findIndexOfTarget(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Add two n-bit binary numbers.
     * @param first first binary number
     * @param second second binary number
     * @return sum of two binary number
     */
    public static int[] addBinary(int[] first, int[] second) {
        int[] sum = new int[first.length + 1];
        int addOne = 0;
        for (int i = first.length - 1; i >= 0; i--) {
            int total = first[i] + second[i] + addOne;
            sum[i + 1] = total % 2;
            addOne = total / 2;
        }
        sum[0] = addOne;
        return sum;
    }

    /**
     * EX 2-4. Find the number of inversions in an array.
     * @param nums an array of integers
     * @return the number of inversions
     */
    public static int numberOfInversions(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return numberOfInversions(nums, 0, nums.length);
    }

    /**
     * EX 2-4. Find the number of inversions in an array in range [low, high).
     * @param nums an array of integers
     * @return the number of inversions
     */
    private static int numberOfInversions(int[] nums, int low, int high) {
        if (nums == null || nums.length < 2 || low >= high - 1) {
            return 0;
        }
        int mid = (low + high) >>> 1;
        int left = numberOfInversions(nums, low, mid);
        int right = numberOfInversions(nums, mid, high);
        return left + right + merge(nums, low, mid, high);
    }

    /**
     * Find number of inversions where i in range [low, mid), j in range [mid, high).
     * @param nums array of integers
     * @param low low index
     * @param mid mid index
     * @param high high index
     * @return number of inversions
     */
    private static int merge(int[] nums, int low, int mid, int high) {
        if (low >= mid) {
            return 0;
        }
        int count = 0;
        int[] leftCopy = Arrays.copyOfRange(nums, low, mid);
        int[] rightCopy = Arrays.copyOfRange(nums, mid, high);
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = low; i < high; i++) {
            if (leftIndex >= leftCopy.length) {
                nums[i] = rightCopy[rightIndex++];
            } else if (rightIndex >= rightCopy.length) {
                count += rightIndex;
                nums[i] = leftCopy[leftIndex];
            } else if (leftCopy[leftIndex] < rightCopy[rightIndex]) {
                count += rightIndex;
                nums[i] = leftCopy[leftIndex++];
            } else {
                nums[i] = rightCopy[rightIndex++];
            }
        }
        return count;
    }
}
