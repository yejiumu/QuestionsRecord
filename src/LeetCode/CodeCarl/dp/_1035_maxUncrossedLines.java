package LeetCode.CodeCarl.dp;

/**
 * 不相交的线
 *
 * @author xoke
 * @date 2022/12/6
 */
public class _1035_maxUncrossedLines {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了99.35%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了80.12%的用户
     */
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        // 和1143是一模一样，就是求最大公共子序列
        int len1 = nums1.length, len2 = nums2.length;
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
