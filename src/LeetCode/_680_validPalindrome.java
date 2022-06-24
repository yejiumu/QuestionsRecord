package LeetCode;

/**
 * 验证回文字符串 Ⅱ
 */
public class _680_validPalindrome {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了77.55%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了58.47%的用户
     */
    public boolean validPalindrome(String s) {
        // 双指针
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // 遇到不相同的直接左右边跳过再进行比较
            if (s.charAt(left) != s.charAt(left)) {
                return isValid(s, left + 1, right) || isValid(s, left, right - 1);
            }
            // 向中间靠拢
            left++;
            right--;
        }
        return true;
    }

    public boolean isValid(String s, int left, int right) {
        // 继续比较
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
