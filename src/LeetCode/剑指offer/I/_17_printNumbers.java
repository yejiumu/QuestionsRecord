package LeetCode.剑指offer.I;

/**
 * 打印从1到最大的n位数
 *
 * @author jiumu
 * @date 2023/2/21
 */
public class _17_printNumbers {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了72.76%的用户
     * 内存消耗：48.7 MB, 在所有 Java 提交中击败了93.67%的用户
     */
    public int[] printNumbers(int n) {
        int len = (int) Math.pow(10, n) - 1;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
