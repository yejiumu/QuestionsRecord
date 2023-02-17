package LeetCode.剑指offer.I;

/**
 * 数字序列中某一位的数字
 *
 * @author jiumu
 * @date 2023/2/17
 */
public class _44_findNthDigit {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了91.93%的用户
     */
    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1, count = 9;
        while (n > count) {
            n -= count;
            start *= 10;
            digit++;
            count = 9 * start * digit;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }
}
