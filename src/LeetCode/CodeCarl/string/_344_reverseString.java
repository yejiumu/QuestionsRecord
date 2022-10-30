package LeetCode.CodeCarl.string;

/**
 * 反转字符串
 *
 * @author xoke
 * @date 2022/10/30
 */
public class _344_reverseString {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：48.5 MB, 在所有 Java 提交中击败了7.92%的用户
     */
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        char temp;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
