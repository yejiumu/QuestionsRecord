package LeetCode;

/**
 * 最大子数组和
 * <p>
 * 方法：动态规划
 */
public class _53_maxSubArray {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了97.82%的用户
     * 内存消耗：48.7 MB, 在所有 Java 提交中击败了26.38%的用户
     */
    public int maxSubArray(int[] nums) {
        int max = 0, cur = 0;
        for (int num : nums) {
            cur = Math.max(cur + num, num);
            max = Math.max(max, cur);
        }
        return max;
    }
}
