package LeetCode;

public class _476_findComplement {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了86.71%的用户
     */
    public int findComplement(int num) {
        // 特殊情况考虑
        if (num == 0) {
            return 1;
        }
        int k = 0;
        // 10101->01010，相加为11111=>2^k-1，所以求出该数的位数即可
        // 因为有2147483647，所以要用要long类型加大范围
        // 1 << 31 => -2147483648
        // 1L << 31 => 2147483648
        while ((1L << k) <= num) {
            k++;
        }
        // 直接左移k位后减一再减n即可
        return (1 << k) - num - 1;
    }
}
