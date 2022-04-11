package LeetCode;

/**
 * 统计各位数字都不同的数字个数
 */
public class _357_countNumbersWithUniqueDigits {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了44.97%的用户
     */
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10;
        }
        // 排列组合
        // 1
        // 1 + 9
        // 1 + 9 + 9 * 9
        // 1 + 9 + 9 * 9 + 9 * 9 * 8
        // 1 + 9 + 9 * 9 + 9 * 9 * 8 + 9 * 9 * 8 * 7
        // 1 + 9 + 9 * 9 + 9 * 9 * 8 + 9 * 9 * 8 * 7 + 9 * 9 * 8 * 7 * 6
        // 1 + 9 + 9 * 9 + 9 * 9 * 8 + 9 * 9 * 8 * 7 + 9 * 9 * 8 * 7 * 6 + 9 * 9 * 8 * 7 * 6 * 5
        // 1 + 9 + 9 * 9 + 9 * 9 * 8 + 9 * 9 * 8 * 7 + 9 * 9 * 8 * 7 * 6 + 9 * 9 * 8 * 7 * 6 * 5 + 9 * 9 * 8 * 7 * 6 * 5 * 4
        // ......
        int ans = 10, cur = 9;
        for (int i = 0; i < n - 1; i++) {
            cur *= 9 - i;
            ans += cur;
        }
        return ans;
    }
}
