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
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗： 57.4 MB, 在所有 Java 提交中击败了27.43%的用户
     */
    public int maxProfit(int[] prices) {
        //如果只有一个或零个数值，直接返回0
        if (prices.length <= 1) {
            return 0;
        }
        //min为前i项最小，max为前i项最大利润差
        int min = prices[0], max = 0, len = prices.length;
        for (int i = 1; i < len; i++) {
            if (prices[i] < min) {
                //如果出现比min更小的，直接交换
                min = prices[i];
            } else if (prices[i] - min > max) {
                //如果出现更大的差额，也直接换
                max = prices[i] - min;
            }
        }
        return max;
    }
}
