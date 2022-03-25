package LeetCode;

/**
 * 阶乘后的零
 */
public class _172_trailingZeroes {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了24.10%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了56.29%的用户
     * <p>
     * 遍历算5的个数，没想到这么慢
     */
//    public int trailingZeroes(int n) {
//        int res = 0;
//        for (int i = 5; i <= n; i += 5) {
//            for (int j = i; j % 5 == 0; j /= 5) {
//                ++res;
//            }
//        }
//        return res;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了21.44%的用户
     */
    public int trailingZeroes(int n) {
        int res = 0;
        while (n != 0) {
            // 对n进行循环除以5操作(n前面肯定有n / 5个5)
            n /= 5;
            // 并将结果累加即可
            res += n;
        }
        return res;
    }
}
