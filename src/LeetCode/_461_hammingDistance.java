package LeetCode;

/**
 * 汉明距离
 */
public class _461_hammingDistance {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了39.82%的用户
     */
//    public int hammingDistance(int x, int y) {
//        int res = 0;
//        for (int i = 0; i < 32; i++) {
//            if ((x & 1) != (y & 1)) {
//                res++;
//            }
//            x >>= 1;
//            y >>= 1;
//        }
//        return res;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了36.25%的用户
     * <p>
     * 亦或运算(^)，当二进制位不同时结果为 1
     */
    public int hammingDistance(int x, int y) {
        int bit = x ^ y, res = 0;
        while (bit != 0) {
            //n & 1 返回二进制最后一位是否为1，是返回1，否返回0
            res += bit & 1;
            bit >>= 1;
        }
        return res;
    }
}
