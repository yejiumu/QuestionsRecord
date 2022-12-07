package LeetCode.CodeCarl.dp;

/**
 * 两个字符串的删除操作
 *
 * @author xoke
 * @date 2022/12/7
 */
public class _583_minDistance {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了85.75%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了22.50%的用户
     */
    public int minDistance(String word1, String word2) {
        // 统计出最长公共最长序列长度
        int len1 = word1.length(), len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // 然后两者长度相减即可
        return len1 + len2 - 2 * dp[len1][len2];
    }
}
