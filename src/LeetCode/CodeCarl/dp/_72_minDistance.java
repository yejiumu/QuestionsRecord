package LeetCode.CodeCarl.dp;

/**
 * 编辑距离
 *
 * @author xoke
 * @date 2022/12/7
 */
public class _72_minDistance {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了88.05%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了13.25%的用户
     */
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= len2; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // 不修改
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // 删除（删除+添加）和替换的较小步数加一
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                }
            }
        }
        return dp[len1][len2];
    }
}
