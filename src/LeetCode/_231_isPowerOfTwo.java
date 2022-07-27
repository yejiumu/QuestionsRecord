package LeetCode;

/**
 * 2的幂
 */
public class _231_isPowerOfTwo {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了55.91%的用户
     */
    public boolean isPowerOfTwo_(int n) {
        // 直接判断二进制1的个数是否为1
        return n > 0 && Integer.bitCount(n) == 1;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了50.16%的用户
     */
    public boolean isPowerOfTwo(int n) {
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
            ans *= 2;
        }
    }
}
