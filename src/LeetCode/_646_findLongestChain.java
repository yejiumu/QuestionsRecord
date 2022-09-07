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
        // 按右区间进行升序排序，贪心以保证最长数对链
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int ans = 0, len = pairs.length;
        for (int i = 1, temp = pairs[0][1]; i < len; i++) {
            // 就近找到符合条件的区间
            if (pairs[i][0] > temp) {
                // ans自增
                ++ans;
                // 目前的右区间进行替换
                temp = pairs[i][1];
            }
        }
        return ans;
    }
}
