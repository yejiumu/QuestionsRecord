package LeetCode;

/**
 * Excel 表列序号
 *
 * @author xoke
 * @date 2022/12/17
 */
public class _171_titleToNumber {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了46.83%的用户
     * 内存消耗：40.4 MB, 在所有 Java 提交中击败了31.54%的用户
     */
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (char ch : columnTitle.toCharArray()) {
            res *= 26;
            res += ch - 'A' + 1;
        }
        return res;
    }
}
