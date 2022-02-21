package LeetCode;

import java.util.Arrays;

/**
 * 学生分数的最小差值
 */
public class _1984_minimumDifference {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了99.98%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了56.10%的用户
     */
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int l = 0, r = k - 1; r < nums.length; ) {
            res = Math.min(res, nums[r++] - nums[l++]);
        }
        return res;
    }
}
