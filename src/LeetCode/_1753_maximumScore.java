package LeetCode;

import java.util.Arrays;

/**
 * 移除石子的最大得分
 *
 * @author xoke
 * @date 2022/12/21
 */
public class _1753_maximumScore {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了60.92%的用户
     */
    public int maximumScore(int a, int b, int c) {
        int[] v = new int[]{a, b, c};
        Arrays.sort(v);
        if (v[0] + v[1] <= v[2]) {
            return v[0] + v[1];
        }
        // (a + b - c) / 2 + c
        return (v[0] + v[1] + v[2]) / 2;
    }
}
