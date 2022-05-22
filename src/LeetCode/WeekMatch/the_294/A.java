package LeetCode.WeekMatch.the_294;

/**
 * 字母在字符串中的百分比
 */
public class A {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public int percentageLetter(String s, char letter) {
        int ans = 0;
        for (char ch : s.toCharArray()) {
            if (ch == letter) {
                ans++;
            }
        }
        return ans * 100 / s.length();
    }
}
