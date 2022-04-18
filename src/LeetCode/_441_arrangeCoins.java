package LeetCode;

/**
 * 排列硬币
 */
public class _441_arrangeCoins {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了96.74%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了56.80%的用户
     */
    public int arrangeCoins(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            // 就是寻找小于等于n的最大前x项和
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
