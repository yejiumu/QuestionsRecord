package LeetCode;

/**
 * 检查句子中的数字是否递增
 *
 * @author xoke
 * @date 2023/1/3
 */
public class _2042_areNumbersAscending {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了40.66%的用户
     */
    public boolean areNumbersAscending(String s) {
        int pre = 0, pos = 0, len = s.length();
        while (pos < len) {
            if (Character.isDigit(s.charAt(pos))) {
                int cur = 0;
                while (pos < len && Character.isDigit(s.charAt(pos))) {
                    cur += cur * 10 + s.charAt(pos) - '0';
                    pos++;
                }
                if (cur <= pre) {
                    return false;
                }
                pre = cur;
            } else {
                pos++;
            }
        }
        return true;
    }
}
