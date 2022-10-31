package LeetCode.CodeCarl.string;

/**
 * 左旋转字符串
 *
 * @author xoke
 * @date 2022/10/31
 */
public class _offer_II_58_reverseLeftWords {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了5.14%的用户
     */
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
