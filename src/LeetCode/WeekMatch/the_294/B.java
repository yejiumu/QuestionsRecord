package LeetCode.WeekMatch.the_294;

import java.util.Arrays;

/**
 * 装满石头的背包的最大数量
 */
public class B {
    /**
     * 执行用时：14 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：52.9 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int ans = 0;
        int len = capacity.length;
        int[] difference = new int[len];
        for (int i = 0; i < len; i++) {
            difference[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(difference);
        for (int i = 0; i < len; i++) {
            if (difference[i] <= additionalRocks) {
                additionalRocks -= difference[i];
                difference[i] = 0;
            }
            if (difference[i] == 0) {
                ans++;
            }
        }
        return ans;
    }
}
