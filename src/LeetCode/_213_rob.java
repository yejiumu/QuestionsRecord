package LeetCode;

/**
 * 打家劫舍 II
 *
 * @author xoke
 * @date 2022/12/3
 */
public class _213_rob {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了8.38%的用户
     */
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        // 考虑包含首元素，不包含尾元素+考虑包含尾元素，不包含首元素
        return Math.max(robAct(nums, 0, len - 2), robAct(nums, 1, len - 1));
    }

    public int robAct(int[] nums, int left, int right) {
        if (right == left) {
            return nums[right];
        }
        int[] dp = new int[nums.length];
        dp[left] = nums[left];
        dp[left + 1] = Math.max(nums[left], nums[left + 1]);
        for (int i = left + 2; i <= right; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[right];
    }
}
