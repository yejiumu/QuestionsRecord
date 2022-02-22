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
    public int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {//当全部1变为0
            //n & (n - 1)，其运算结果恰为把 n 的二进制位中的最低位的 1 变为 0 之后的结果。
            n &= n - 1;
            ret++;
        }
        return ret;
    }

}
