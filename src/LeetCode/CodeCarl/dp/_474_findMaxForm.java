package LeetCode.CodeCarl.dp;

/**
 * 一和零
 *
 * @author xoke
 * @date 2022/12/1
 */
public class _474_findMaxForm {
    /**
     * 执行用时：17 ms, 在所有 Java 提交中击败了82.64%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了43.06%的用户
     */
    public int findMaxForm(String[] strs, int m, int n) {
        // dp[i][j]表示i个0和j个1时的最大子集
        int[][] dp = new int[m + 1][n + 1];
        // 遍历物品
        for (String str : strs) {
            int zero = 0, one = 0;
            // 统计01数量
            for (char ch : str.toCharArray()) {
                if (ch == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
            // 遍历背包容量且从后向前遍历
            for (int i = m; i >= zero; i--) {
                for (int j = n; j >= one; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
