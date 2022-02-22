package LeetCode;

/**
 * 在区间的范围内统计奇数数目
 */
public class _1523_countOdds {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：37.9 MB, 在所有 Java 提交中击败了74.07%的用户
     */
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - (low - 1) / 2;
    }
}
