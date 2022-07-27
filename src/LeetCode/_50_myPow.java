package LeetCode;

/**
 * Pow(x, n)
 *
 * @author xoke
 * @date 2022/7/27
 */
public class _50_myPow {
    public double myPow(double x, int n) {
        return (long) n >= 0 ? quickMul(x, n) : 1.0 / quickMul(x, -(long) n);
    }

    public double quickMul(double x, long n) {
        double ans = 1.0;
        // 将x的最高次方的初始值设为1次方
        double x_n = x;
        // 在对 N 进行二进制拆分的同时计算答案
        while (n > 0) {
            if (n % 2 == 1) {
                // 如果 N 二进制表示的最低位为 1
                // x的n乘入ans中
                ans *= x_n;
            }
            // x的n次方不断地平方
            x_n *= x_n;
            // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
            n /= 2;
        }
        return ans;
    }
}
