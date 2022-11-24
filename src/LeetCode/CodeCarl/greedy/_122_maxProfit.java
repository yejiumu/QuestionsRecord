package LeetCode.CodeCarl.greedy;

/**
 * @author xoke
 * @date 2022/11/24
 */
public class _122_maxProfit {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了82.36%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了44.34%的用户
     */
    public int maxProfit(int[] prices) {
        // 贪心，直接考虑每两天的利润，不用考虑跨天的利润
        int res = 0, len = prices.length;
        for (int i = 1; i < len; i++) {
            // 只要相邻两天的利润大于0，就累加
            // 贪，都可以贪，使劲贪
            res += Math.max(prices[i] - prices[i - 1], 0);
        }
        return res;
    }
}
