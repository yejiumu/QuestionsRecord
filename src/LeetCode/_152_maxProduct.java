package LeetCode;

/**
 * 乘积最大子数组
 */
public class _152_maxProduct {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了96.48%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了5.11%的用户
     */
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1; //一个保存最大的，一个保存最小的。
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = imax;
                imax = imin;
                imin = tmp;
            } //如果数组的数是负数，那么会导致最大的变最小的，最小的变最大的。因此交换两个的值。
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }
}
