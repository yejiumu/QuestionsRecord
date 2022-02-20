package LeetCode;

/**
 * 两数之和
 */
public class _1_twoSum {
    /**
     * 执行用时：55 ms, 在所有 Java 提交中击败了26.42%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了79.06%的用户
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
