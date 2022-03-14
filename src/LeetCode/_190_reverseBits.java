package LeetCode;

import java.util.Arrays;

/**
 * 颠倒二进制位
 */
public class _190_reverseBits {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了21.92%的用户
     * <p>
     * 将 n 视作一个长为 32 的二进制串，从低位往高位枚举 n 的每一位，将其倒序添加到翻转结果 res。
     * 代码实现中，每枚举一位就将 n 右移一位，这样当前 n 的最低位就是我们要枚举的比特位。
     * 当 n 为 0 时即可结束循环。
     */
    public int reverseBits(int n) {
        int res = 0;
        //进行32次循环，或直到 n != 0
        for (int i = 0; i < 32 && n != 0; ++i) {
            //从低位往高位枚举 n 的每一位，将其倒序添加到翻转结果 res
            res |= (n & 1) << (31 - i);
            //将n逻辑右移
            n >>>= 1;
        }
        return res;
    }
}
