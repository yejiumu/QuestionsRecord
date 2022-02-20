package LeetCode;

/**
 * 括号的最大嵌套深度
 */
public class _1614_maxDepth {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：36.5 MB, 在所有 Java 提交中击败了50.10%的用户
     */
    public int maxDepth(String s) {
        int max = 0, temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                temp++;
            }
            if (s.charAt(i) == ')') {
                temp--;
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}
