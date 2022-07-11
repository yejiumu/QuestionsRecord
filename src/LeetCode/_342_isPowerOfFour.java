package LeetCode;

/**
 * 4的幂
 */
public class _342_isPowerOfFour {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了5.04%的用户
     */
    public boolean isPowerOfFour(int n) {
        // 直接位运算
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }
}
