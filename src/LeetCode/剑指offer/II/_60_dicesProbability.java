package LeetCode.剑指offer.II;

import java.util.Arrays;

/**
 * n个骰子的点数
 *
 * @author jiumu
 * @date 2023/1/29
 */
public class _60_dicesProbability {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了99.83%的用户
     */
    public double[] dicesProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp, 1.0 / 6.0);
        for (int i = 2; i <= n; i++) {
            double[] temp = new double[5 * i + 1];
            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j + k] += dp[j] / 6;
                }
            }
            dp = temp;
        }
        return dp;
    }
}
