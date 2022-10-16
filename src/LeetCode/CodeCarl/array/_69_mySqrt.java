package LeetCode.CodeCarl.array;

/**
 * x 的平方根
 *
 * @author xoke
 * @date 2022/10/16
 */
public class _69_mySqrt {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了93.87%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了29.00%的用户
     */
    public int mySqrt(int x) {
        int left = 0, right = x, res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
                res = mid;
            }
        }
        return res;
    }
}
