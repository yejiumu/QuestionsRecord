package LeetCode;

/**
 * 优美的排列 II
 */
public class _667_constructArray {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了32.09%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了52.70%的用户
     * <p>
     * 没看懂，下次在看吧
     */
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1, interval = k; i <= k; i++, interval--) {
            ans[i] = i % 2 == 1 ? ans[i - 1] + interval : ans[i - 1] - interval;
        }
        for (int i = k + 1; i < n; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }
}
