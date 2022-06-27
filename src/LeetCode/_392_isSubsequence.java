package LeetCode;

/**
 * 判断子序列
 */
public class _392_isSubsequence {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了89.59%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了39.66%的用户
     */
    public boolean isSubsequence(String s, String t) {
        int left = 0, right = 0;
        // 两个字符串一一匹配字符即可
        while (left < s.length() && right < t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                // 匹配成功，两两后移
                left++;
                right++;
                continue;
            }
            // 否则只有t后移
            right++;
        }
        return left == s.length();
    }
}
