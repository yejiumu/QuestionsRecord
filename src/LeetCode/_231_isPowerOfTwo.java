package LeetCode;

/**
 * 2的幂
 */
public class _231_isPowerOfTwo {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了55.91%的用户
     */
    public boolean isPowerOfTwo(int n) {
        // 直接判断二进制1的个数是否为1
        return n > 0 && Integer.bitCount(n) == 1;
    }
}
