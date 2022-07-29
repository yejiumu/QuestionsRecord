package LeetCode;

/**
 * 位1的个数
 */
public class _191_hammingWeight {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了17.88%的用户
     */
//    public int hammingWeight(int n) {
//        int res = 0;
//        for (int i = 0; i < 32; i++) {
//            if ((n & 1) == 1) {
//                res++;
//            }
//            n >>= 1;
//        }
//        return res;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了10.44%的用户
     */
    public int hammingWeight_(int n) {
        int ret = 0;
        // 当全部1变为0
        while (n != 0) {
            // n & (n - 1)，其运算结果恰为把 n 的二进制位中的最低位的 1 变为 0 之后的结果
            // 010101010111000 -> n
            // 010101010110111 -> n-1
            // 010101010110000 => n&(n-1)
            // 两者做与运算，相当于将n的最低位1转为0，前面位数保留
            n &= n - 1;
            ret++;
        }
        return ret;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了65.94%的用户
     */
    public int hammingWeight(int n) {
        int ans = 0;
        // 当 n 为 0 时，停止循环
        while (n != 0) {
            // 将该数与1进行与运输(即查看最后一位是否为1)
            // 如果为1，ans累加
            if ((n & 1) == 1) {
                ans++;
            }
            // 因为 n 可能为负数，所以要无符号右移
            n >>>= 1;
        }
        return ans;
    }

}
