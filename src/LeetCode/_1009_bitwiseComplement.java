package LeetCode;

/**
 * 十进制整数的反码
 *
 * @author xoke
 * @date 2022/7/28
 */
public class _1009_bitwiseComplement {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了80.91%的用户
     */
    public int bitwiseComplement(int n) {
        // 特殊情况考虑
        if (n == 0) {
            return 1;
        }
        // 10101->01010，相加为11111=>2^k-1，所以求出该数的位数即可
        int k = 0;
        while ((1 << k) <= n) {
            k++;
        }
        // 直接左移k位后减一再减n即可
        return (1 << k) - 1 - n;
    }
}
