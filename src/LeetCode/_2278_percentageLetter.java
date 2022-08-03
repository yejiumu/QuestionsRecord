package LeetCode;

/**
 * 字母在字符串中的百分比
 *
 * @author xoke
 * @date 2022/8/3
 */
public class _2278_percentageLetter {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了5.07%的用户
     */
    public int percentageLetter(String s, char letter) {
        int num = 0;
        // 直接遍历统计相同的字符个数
        for (char ch : s.toCharArray()) {
            if (ch == letter) {
                num++;
            }
        }
        // 乘100后除以字符串长度即可
        return num * 100 / s.length();
    }
}
