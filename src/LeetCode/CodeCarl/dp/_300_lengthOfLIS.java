package LeetCode.CodeCarl.dp;

import java.util.Arrays;

/**
 * 最长递增子序列
 *
 * @author xoke
 * @date 2022/12/5
 */
public class _300_lengthOfLIS {
    /**
     * 执行用时：65 ms, 在所有 Java 提交中击败了10.88%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了19.82%的用户
     */
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return 1;
        }
        int[] dp = new int[len + 1];
        int res = 0;
        Arrays.fill(dp, 1);
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                if (res < dp[i]) {
                    res = dp[i];
                }
            }
        }
        return res;
    }
}
