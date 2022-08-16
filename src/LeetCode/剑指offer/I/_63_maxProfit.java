package LeetCode.剑指offer.I;

/**
 * 股票的最大利润
 *
 * @author xoke
 * @date 2022/8/16
 */
public class _63_maxProfit {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了21.94%的用户
     */
    public int maxProfit(int[] prices) {
        // 如果只有一个或零个数值，直接返回0
        int len = prices.length;
        if (len <= 1) {
            return 0;
        }
        // min为前i项最小，max为前i项最大利润差
        int min = prices[0], max = 0;
        for (int i = 1; i < len; i++) {
            if (prices[i] < min) {
                // 如果出现比min更小的，直接交换
                min = prices[i];
            } else if (prices[i] - min > max) {
                // 如果出现更大的差额，也直接换
                max = prices[i] - min;
            }
        }
        return max;
    }
}
