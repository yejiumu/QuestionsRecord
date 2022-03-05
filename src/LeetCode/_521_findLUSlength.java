package LeetCode;

import java.util.Arrays;

/**
 * 最长特殊序列 Ⅰ
 */
public class _521_findLUSlength {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了27.25%的用户
     *
     * 这题目也太绕了，差点没看懂，其实很简单，只要两个字符串之间有不同的地方那就是特殊序列
     */
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
