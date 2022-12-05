package LeetCode;

import java.util.Arrays;

/**
 * 最长连续递增序列
 *
 * @author xoke
 * @date 2022/12/5
 */
public class _674_findLengthOfLCIS {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.96%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了69.91%的用户
     */
    public int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len + 1];
        Arrays.fill(dp, 1);
        int res = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
            if (res < dp[i]) {
                res = dp[i];
            }
        }
        return res;
    }
}
