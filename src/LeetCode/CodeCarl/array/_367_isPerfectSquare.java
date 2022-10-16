package LeetCode.CodeCarl.array;

/**
 * 有效的完全平方数
 *
 * @author xoke
 * @date 2022/10/16
 */
public class _367_isPerfectSquare {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了71.77%的用户
     */
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num, res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
                res = mid;
            }
        }
        return res * res == num;
    }
}
