package LeetCode.LCP;

/**
 * 拿硬币
 *
 * @author xoke
 * @date 2022/8/3
 */
public class _6_minCount {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了60.07%的用户
     */
    public int minCount(int[] coins) {
        int sum = 0;
        for (int coin : coins) {
            // 累加每堆硬币取2个取完的次数
            // sum += coin % 2 == 1 ? coin / 2 + 1 : coin / 2;
            // 这个取整更方便
            sum += (coin + 1) / 2;
        }
        return sum;
    }
}
