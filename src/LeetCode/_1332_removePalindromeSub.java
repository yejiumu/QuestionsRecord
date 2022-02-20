package LeetCode;

/**
 * 删除回文子序列
 */
public class _1332_removePalindromeSub {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：36.2 MB, 在所有 Java 提交中击败了43.79%的用户
     */
    public int removePalindromeSub(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return 2;
            }
        }
        return 1;
    }
}
