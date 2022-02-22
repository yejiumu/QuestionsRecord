package LeetCode;

import java.util.Arrays;

/**
 * 两整数之和
 * <p>
 * can't use '+' and '-'
 */
public class _371_getSum {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了19.09%的用户
     */
    public int getSum(int a, int b) {
        int[] num = {a, b};
        return Arrays.stream(num).sum();
    }
}
