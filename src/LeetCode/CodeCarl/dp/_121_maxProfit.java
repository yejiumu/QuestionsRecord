package LeetCode.CodeCarl.dp;

/**
 * 买卖股票的最佳时机
 *
 * @author xoke
 * @date 2022/12/4
 */
public class _121_maxProfit {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：57.8 MB, 在所有 Java 提交中击败了30.39%的用户
     */
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int price : prices) {
            // 遍历维护最小值
            min = Math.min(min, price);
            // 更新最大差值
            res = Math.max(res, price - min);
        }
        return res;
    }
}
