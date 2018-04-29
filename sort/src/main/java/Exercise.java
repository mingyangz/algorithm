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
}
