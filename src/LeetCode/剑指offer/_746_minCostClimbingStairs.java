package LeetCode.剑指offer;

/**
 * 使用最小花费爬楼梯
 *
 * @author xoke
 * @date 2022/8/4
 */
public class _746_minCostClimbingStairs {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了5.57%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了67.89%的用户
     */
    public int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[1010];
        arr[0] = 0;
        arr[1] = 0;
        int len = cost.length;
        for (int i = 2; i <= len; i++) {
            // 第0层和第1层花费为0，因为可以从任意一层开始爬楼
            // 从第2层开始，取前一层花费和前两层的最小值
            arr[i] = Math.min(arr[i - 2] + cost[i - 2], arr[i - 1] + cost[i - 1]);
        }
        return arr[len];
    }
}
