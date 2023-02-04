package LeetCode;

import java.util.Arrays;

/**
 * 你能构造出连续值的最大数目
 *
 * @author jiumu
 * @date 2023/2/4
 */
public class _1798_getMaximumConsecutive {
    /**
     * 执行用时：17 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：48.7 MB, 在所有 Java 提交中击败了88.46%的用户
     */
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int res = 1;
        for (int coin : coins) {
            if (coin > res) {
                break;
            }
            res += coin;
        }
        return res;
    }
}
