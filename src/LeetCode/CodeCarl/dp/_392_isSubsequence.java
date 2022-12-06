package LeetCode.CodeCarl.dp;

/**
 * 判断子序列
 *
 * @author xoke
 * @date 2022/12/6
 */
public class _392_isSubsequence {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了27.78%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了8.52%的用户
     */
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length(), len2 = t.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[len1][len2] == len1;
    }
}
