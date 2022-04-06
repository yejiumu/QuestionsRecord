package LeetCode;

/**
 * 有效的完全平方数
 */
public class _367_isPerfectSquare {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了36.50%的用户
     */
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid > num) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans * ans == num;
    }
}
