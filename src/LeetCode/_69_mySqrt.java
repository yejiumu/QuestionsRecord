package LeetCode;

/**
 * x 的平方根
 */
public class _69_mySqrt {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了94.85%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了70.22%的用户
     */
    public int mySqrt(int x) {
        int left = 0, right = x, res = -1;
        while (left <= right) {
            // 防止两个数太大相加超出范围
            int mid = left + (right - left) / 2;
            // 可能会超出int范围
            if ((long) mid * mid > x) {
                right = mid - 1;
            } else {
                res = mid;
                left = mid + 1;
            }
        }
        return res;
    }
}
