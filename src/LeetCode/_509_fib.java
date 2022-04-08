package LeetCode;

/**
 * 斐波那契数
 */
public class _509_fib {
    /**
     * 执行用时：8 ms, 在所有 Java 提交中击败了24.18%的用户
     * 内存消耗：37.6 MB, 在所有 Java 提交中击败了78.49%的用户
     */
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
