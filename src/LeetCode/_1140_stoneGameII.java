package LeetCode;

/**
 * 石子游戏 II
 *
 * @author jiumu
 * @date 2023/2/22
 */
public class _1140_stoneGameII {
    /**
     * 执行用时：9 ms, 在所有 Java 提交中击败了18.62%的用户
     * 内存消耗：40.6 MB, 在所有 Java 提交中击败了93.09%的用户
     */
    public int stoneGameII(int[] piles) {
        int len = piles.length, sum = 0;
        int[][] dp = new int[len][len + 1];
        for (int i = len - 1; i >= 0; i--) {
            sum += piles[i];
            for (int M = 1; M <= len; M++) {
                if (i + 2 * M >= len) {
                    dp[i][M] = sum;
                } else {
                    for (int x = 1; x <= 2 * M; x++) {
                        dp[i][M] = Math.max(dp[i][M], sum - dp[i + x][Math.max(x, M)]);
                    }
                }
            }
        }
        return dp[0][1];
    }
}
