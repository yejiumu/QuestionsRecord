package LeetCode;

/**
 * 买卖股票的最佳时机
 */
public class _121_maxProfit {
    /*
     * 暴力可能会超时
     */
//    public int maxProfit(int[] prices) {
//        int num = 0, max = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                num = prices[j] - prices[i];
//                max = Math.max(num, max);
//            }
//        }
//        return max;

    /**
     * 动态规划
     * <p>
     * 执行用时：2 ms, 在所有 Java 提交中击败了91.48%的用户
     * 内存消耗：51 MB, 在所有 Java 提交中击败了91.16%的用户
     */
    public int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int min = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}
