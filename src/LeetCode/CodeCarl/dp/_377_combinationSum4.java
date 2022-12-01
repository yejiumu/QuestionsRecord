package LeetCode.CodeCarl.dp;

/**
 * 组合总和 Ⅳ
 *
 * @author xoke
 * @date 2022/12/1
 */
public class _377_combinationSum4 {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了97.51%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了58.98%的用户
     */
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        int len = nums.length;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < len; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
