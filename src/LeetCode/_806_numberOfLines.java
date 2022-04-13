package LeetCode;

/**
 * 写字符串需要的行数
 */
public class _806_numberOfLines {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了64.17%的用户
     */
    public int[] numberOfLines(int[] widths, String s) {
        // 字符串不为空，所以默认行数为1
        int numLine = 1;
        int num = 0;
        // 遍历字符串
        for (char ch : s.toCharArray()) {
            if (num + widths[ch - 'a'] > 100) {
                // 如果当前行宽度 + 下一字符宽度 > 100，直接换行，并将行数加一
                num = widths[ch - 'a'];
                numLine++;
            } else {
                // 如果当前行宽度 + 下一字符宽度 <= 100，只将当前宽度与下一字符宽度相加即可
                num += widths[ch - 'a'];
            }
        }
        return new int[]{numLine, num};
    }
}
