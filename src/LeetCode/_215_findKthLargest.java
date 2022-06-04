package LeetCode;

import java.util.Arrays;

/**
 * 数组中的第K个最大元素
 */
public class _215_findKthLargest {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了81.60%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了68.15%的用户
     */
    public int findKthLargest(int[] nums, int k) {
        // 我是API选手😭
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
