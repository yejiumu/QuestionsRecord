package LeetCode.剑指offer.I;

/**
 * 左旋转字符串
 *
 * @author xoke
 * @date 2022/8/11
 */
public class _58_2_reverseLeftWords {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了36.75%的用户
     */
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了43.73%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了12.79%的用户
     */
    public String reverseLeftWords_(String s, int n) {
        StringBuilder str = new StringBuilder();
        int len = s.length();
        for (int i = n; i < n + len; i++) {
            str.append(s.charAt(i % len));
        }
        return str.toString();
    }
}
