package LeetCode.CodeCarl.dp;

/**
 * 最后一块石头的重量 II
 *
 * @author xoke
 * @date 2022/11/30
 */
public class _1049_lastStoneWeightII {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了96.74%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了80.67%的用户
     */
    public int lastStoneWeightII(int[] stones) {
        int sum = 0, len = stones.length;
        // 求重量总和
        for (int stone : stones) {
            sum += stone;
        }
        // 向下取最靠近中心值的位置
        int target = sum / 2;
        int[] dp = new int[target + 1];
        // 01背包
        for (int i = 0; i < len; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        // 总和减去两倍target即可
        return sum - 2 * dp[target];
    }
}
