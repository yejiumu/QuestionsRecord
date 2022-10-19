package LeetCode;

/**
 * 比较含退格的字符串
 *
 * @author xoke
 * @date 2022/10/19
 */
public class _844_backspaceCompare {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了81.05%的用户
     */
    public boolean backspaceCompare(String s, String t) {
        // 将原字符串进行转化
        return builder(s).equals(builder(t));
    }

    public String builder(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            // 对字符串中的字符逐字进行处理
            if (ch != '#') {
                sb.append(ch);
            } else {
                if (sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}
