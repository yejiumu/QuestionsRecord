package LeetCode.CodeCarl.greedy;

/**
 * 买卖股票的最佳时机含手续费
 *
 * @author xoke
 * @date 2022/11/28
 */
public class _714_maxProfit {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了62.30%的用户
     * 内存消耗：49.9 MB, 在所有 Java 提交中击败了10.64%的用户
     */
    public int maxProfit(int[] prices, int fee) {
        int res = 0, len = prices.length;
        int minPrice = prices[0];
        for (int i = 1; i < len; i++) {
            // 寻找交易最小值
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // 利益大于0
            if (prices[i] > minPrice + fee) {
                // 累加利益
                res += prices[i] - minPrice - fee;
                // 更新交易最小值
                minPrice = prices[i] - fee;
            }
        }
        return res;
    }
}
