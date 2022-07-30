package LeetCode;

/**
 * 数组串联
 *
 * @author xoke
 * @date 2022/7/30
 */
public class _1929_getConcatenation {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了46.05%的用户
     */
    public int[] getConcatenation(int[] nums) {
        // 单纯的两个一样的数组拼接
        int len = nums.length;
        int[] ans = new int[2 * len];
        for (int i = 0; i < len; i++) {
            ans[i] = nums[i];
            ans[i + len] = nums[i];
        }
        return ans;
    }
}
