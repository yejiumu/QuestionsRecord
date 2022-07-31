package LeetCode;

/**
 * 基于排列构建数组
 *
 * @author xoke
 * @date 2022/7/31
 */
public class _1920_buildArray {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了94.70%的用户
     * 内存消耗：42.4 MB, 在所有 Java 提交中击败了9.12%的用户
     */
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            // 题目中给的通式
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
