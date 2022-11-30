package LeetCode.CodeCarl.dp;

/**
 * 分割等和子集
 *
 * @author xoke
 * @date 2022/11/30
 */
public class _416_canPartition {
    /**
     * 执行用时：22 ms, 在所有 Java 提交中击败了75.92%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了52.10%的用户
     */
    public boolean canPartition(int[] nums) {
        // 判空
        if (nums == null) {
            return false;
        }
        int len = nums.length;
        int sum = 0;
        // 求总和
        for (int num : nums) {
            sum += num;
        }
        // 是否可以平分
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];
        // 开始01背包
        for (int i = 0; i < len; i++) {
            for (int j = target; j >= nums[i]; j--) {
                // dp[j] <= j
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[target] == target;
    }
}
