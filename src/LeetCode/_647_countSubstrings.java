package LeetCode;

/**
 * 回文子串
 *
 * @author xoke
 * @date 2022/12/7
 */
public class _647_countSubstrings {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了95.19%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了60.98%的用户
     */
    public int countSubstrings(String s) {
        // 双指针
        int res = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            res += spread(s, i, i, len);
            res += spread(s, i, i + 1, len);
        }
        return res;
    }

    public int spread(String s, int i, int j, int len) {
        int res = 0;
        while (i >= 0 && j < len && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
            res++;
        }
        return res;
    }

    /**
     * 执行用时：9 ms, 在所有 Java 提交中击败了51.14%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了46.36%的用户
     */
    public int countSubstrings_(String s) {
        // 动规
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int res = 0;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        res++;
                        dp[i][j] = true;
                    } else if (dp[i + 1][j - 1]) {
                        res++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return res;
    }
}
