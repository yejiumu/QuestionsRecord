package LeetCode;

/**
 * 目标和
 *
 * @author xoke
 * @date 2022/12/2
 */
public class _494_findTargetSumWays {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了94.46%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了72.38%的用户
     */
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0, len = nums.length;
        for (int num : nums) {
            sum += num;
        }
        if (Math.abs(target) > sum || (target + sum) % 2 == 1) {
            return 0;
        }
        // 背包容量
        int bagSize = (target + sum) / 2;
        int[] dp = new int[bagSize + 1];
        dp[0] = 1;
        // 01背包
        for (int i = 0; i < len; i++) {
            for (int j = bagSize; j >= nums[i]; j--) {
                // 累加数目
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[bagSize];
    }
}
