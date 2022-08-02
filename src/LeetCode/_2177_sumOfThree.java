package LeetCode;

/**
 * 找到和为给定整数的三个连续整数
 *
 * @author xoke
 * @date 2022/8/2
 */
public class _2177_sumOfThree {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40 MB, 在所有 Java 提交中击败了19.01%的用户
     */
    public long[] sumOfThree(long num) {
        // 一定要是3的倍数才可以三个连续整数相加得到num(很明显)
        // (x - 1) + (x) + (x + 1) => num => 3 * x
        if (num / 3 * 3 != num) {
            // 不是倍数，直接返回空数组
            return new long[0];
        }
        // 依次填充
        return new long[]{num / 3 - 1, num / 3, num / 3 + 1};
    }
}
