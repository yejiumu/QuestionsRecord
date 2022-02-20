package LeetCode;

/**
 * 至少是其他数字两倍的最大数
 */
public class _747_dominantIndex {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：36.2 MB, 在所有 Java 提交中击败了47.51%的用户
     */
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int max = Integer.MIN_VALUE + 1, second = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        return max >= second * 2 ? index : -1;
    }
}
