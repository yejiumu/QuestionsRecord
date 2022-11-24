package LeetCode.CodeCarl.greedy;

import java.util.Arrays;

/**
 * 分发饼干
 *
 * @author xoke
 * @date 2022/11/24
 */
public class _455_findContentChildren {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了82.71%的用户
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0, index = s.length - 1;
        int len = g.length - 1;
        for (int i = len; i >= 0 && index >= 0; i--) {
            if (s[index] >= g[i]) {
                index--;
                count++;
            }
        }
        return count;
    }
}
