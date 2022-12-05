package LeetCode.CodeCarl.dp;

/**
 * 最长重复子数组
 *
 * @author xoke
 * @date 2022/12/5
 */
public class _718_findLength {
    /**
     * 执行用时：22 ms, 在所有 Java 提交中击败了83.14%的用户
     * 内存消耗：49.8 MB, 在所有 Java 提交中击败了60.31%的用户
     */
    public int findLength(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int[][] dp = new int[len1 + 1][len2 + 1];
        int res = 0;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (nums2[j - 1] == nums1[i - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                if (res < dp[i][j]) {
                    res = dp[i][j];
                }
            }
        }
        return res;
    }

    /**
     * 执行用时：26 ms, 在所有 Java 提交中击败了58.35%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了90.76%的用户
     */
    public int findLength_(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int[] dp = new int[len2 + 1];
        int res = 0;
        for (int i = 1; i <= len1; i++) {
            for (int j = len2; j >= 1; j--) {
                if (nums1[j - 1] == nums1[i - 1]) {
                    dp[j] = dp[j - 1] + 1;
                } else {
                    dp[j] = 0;
                }
                if (res < dp[j]) {
                    res = dp[j];
                }
            }
        }
        return res;
    }
}
