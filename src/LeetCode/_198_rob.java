package LeetCode;

/**
 * 打家劫舍
 */
public class _198_rob {
    public int rob(int[] nums) {
        //如果数组为空
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        //如果只有一家
        if (length == 1) {
            return nums[0];
        }
        //遍历每家，dp数组对应前i家金额最大和
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            //进行判断
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }
}
