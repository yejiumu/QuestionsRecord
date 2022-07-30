package LeetCode;

/**
 * n 的第 k 个因子
 *
 * @author xoke
 * @date 2022/7/30
 */
public class _1492_kthFactor {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了26.62%的用户
     */
    public int kthFactor(int n, int k) {
        int count = 0;
        // 因为数据量太少，直接遍历判断即可
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                // 如果为因子，count自增
                ++count;
                if (count == k) {
                    // 如果此时刚好为第k个，返回当前即可
                    return i;
                }
            }
        }
        // 没有找到直接返回-1
        return -1;
    }
}
