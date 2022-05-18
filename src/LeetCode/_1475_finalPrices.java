package LeetCode;

import java.util.Stack;

/**
 * 商品折扣后的最终价格
 */
public class _1475_finalPrices {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了48.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了89.65%的用户
     */
    public int[] finalPrices(int[] prices) {
        // 寻找某元素右边更小的元素，直接用单调栈
        int len = prices.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[len];
        // 遍历数组
        for (int i = 0; i < len; i++) {
            // 找到第一个小于当前栈顶的元素，即右边第一个小的元素
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                // 获取下标
                int index = stack.pop();
                // 计算后赋值
                ans[index] = prices[index] - prices[i];
            }
            // 栈中存下标，更好操作
            stack.push(i);
        }
        // 剩下的是右边没有最大的
        while (!stack.isEmpty()) {
            int index = stack.pop();
            // 所以答案为其本身
            ans[index] = prices[index];
        }
        return ans;
    }
}
