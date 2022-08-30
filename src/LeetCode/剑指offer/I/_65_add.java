package LeetCode.剑指offer.I;

import java.util.Arrays;

/**
 * 不用加减乘除做加法
 *
 * @author xoke
 * @date 2022/8/30
 */
public class _65_add {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了5.99%的用户
     */
    public int add(int a, int b) {
        // 因为不允许用 + 号，所以求出异或部分和进位部分依然不能用 + 号，所以只能循环到没有进位为止
        while (b != 0) {
            // 保存进位值，下次循环用
            int c = (a & b) << 1;
            // 保存不进位值，下次循环用
            a = a ^ b;
            // 如果还有进位，再进行循环
            // 如果没有，直接输出没有进位的数值即可
            b = c;
        }
        return a;
    }
}
