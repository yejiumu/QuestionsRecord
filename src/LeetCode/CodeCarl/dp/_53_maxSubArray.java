package LeetCode.CodeCarl.dp;

/**
 * 最大子数组和
 *
 * @author xoke
 * @date 2022/12/6
 */
public class _53_maxSubArray {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了44.05%的用户
     * 内存消耗：51 MB, 在所有 Java 提交中击败了27.07%的用户
     */
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len + 1];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            if (res < dp[i]) {
                res = dp[i];
            }
        }
        return res;
    }
}
