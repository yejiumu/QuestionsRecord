package LeetCode;

import java.util.Arrays;

/**
 * 分发饼干
 */
public class _455_findContentChildren {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了57.89%的用户
     */
    public int findContentChildren(int[] g, int[] s) {
        // 先排序，从小到大
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        // 挨个遍历判断
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                // 如果饼干满足，跳到下一个小孩
                i++;
            }
            // 不管怎样，都要跳到下一个饼干
            j++;
        }
        // 返回小孩的数量
        return i;
    }
}
