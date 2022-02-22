package LeetCode;

/**
 * 比特位计数
 */
public class _338_countBits {
    /**
     * 执行用时：23 ms, 在所有 Java 提交中击败了5.30%的用户
     * 内存消耗：44.4 MB, 在所有 Java 提交中击败了29.16%的用户
     */
//    public int[] countBits(int n) {
//        int[] res = new int[n + 1];
//        for (int i = 0; i <= n; i++) {
//            res[i] = hammingWeight(i);
//        }
//        return res;
//    }
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了42.22%的用户
     * 内存消耗：45.2 MB, 在所有 Java 提交中击败了22.64%的用户
     */
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }
}
