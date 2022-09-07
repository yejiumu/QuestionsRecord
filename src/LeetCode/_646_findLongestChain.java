package LeetCode;

import java.util.Arrays;

/**
 * 最长数对链
 *
 * @author xoke
 * @date 2022/9/7
 */
public class _646_findLongestChain {
    /**
     * 执行用时：8 ms, 在所有 Java 提交中击败了97.72%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了81.14%的用户
     */
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int ans = 0, len = pairs.length;
        for (int i = 1, temp = pairs[0][1]; i < len; i++) {
            if (pairs[i][0] > temp) {
                ++ans;
                temp = pairs[i][1];
            }
        }
        return ans;
    }
}
