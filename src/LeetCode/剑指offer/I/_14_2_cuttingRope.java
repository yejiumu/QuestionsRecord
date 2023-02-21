package LeetCode.剑指offer.I;

/**
 * 剪绳子 II
 *
 * @author jiumu
 * @date 2023/2/20
 */
public class _14_2_cuttingRope {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38 MB, 在所有 Java 提交中击败了92.34%的用户
     */
    public int cuttingRope(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        long res = 1;
        while (n > 4) {
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int) (res * n % 1000000007);
    }
}
