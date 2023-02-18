package LeetCode.剑指offer.I;

/**
 * 数值的整数次方
 *
 * @author jiumu
 * @date 2023/2/18
 */
public class _16_myPow {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了20.82%的用户
     */
    public double myPow(double x, int n) {
        return n >= 0 ? quickMul(x, n) : 1 / quickMul(x, -(long) n);
    }

    public double quickMul(double x, long n) {
        double res = 1.0;
        while (n != 0) {
            if (n % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            n >>= 1;
        }
        return res;
    }
}
