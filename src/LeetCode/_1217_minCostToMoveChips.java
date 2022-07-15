package LeetCode;

/**
 * 玩筹码
 */
public class _1217_minCostToMoveChips {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了18.35%的用户
     */
    public int minCostToMoveChips(int[] position) {
        // 就是统计奇数和偶数的个数
        // 返回其中的较小值
        // 因为跳偶数位格数不付出代价
        // 所以最后出现，奇数和偶数个数的筹码在相邻的位置，取较小值进行移动即可
        int even = 0, odd = 0;
        for (int pos : position) {
            if ((pos & 1) != 0) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(odd, even);
    }
}
