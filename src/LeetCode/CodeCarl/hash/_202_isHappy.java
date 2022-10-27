package LeetCode.CodeCarl.hash;

/**
 * 快乐数
 *
 * @author xoke
 * @date 2022/10/27
 */
public class _202_isHappy {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了80.77%的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了93.50%的用户
     */
    public boolean isHappy(int n) {
        int count = 0;
        while (n != 1 && count++ < 100) {
            n = sumOfBit(n);
        }
        return n == 1;
    }

    public int sumOfBit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
