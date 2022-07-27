package LeetCode;

/**
 * 4的幂
 */
public class _342_isPowerOfFour {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了5.04%的用户
     */
    public boolean isPowerOfFour_(int n) {
        // 直接位运算
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了67.86%的用户
     * <p>
     * 从2的幂过来的，模板直接套
     */
    public boolean isPowerOfFour(int n) {
        // n为负，直接判错
        if (n <= 0) {
            return false;
        }
        // long为了防止越界
        // ans从1一直乘2，与n进行对比
        long ans = 1;
        while (true) {
            if (ans == n) {
                return true;
            } else if (ans > n) {
                return false;
            }
            ans *= 4;
        }
    }
}
