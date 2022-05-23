package LeetCode;

import java.util.Arrays;

/**
 * 数组中最大数对和的最小值
 */
public class _1877_minPairSum {
    /**
     * 执行用时：57 ms, 在所有 Java 提交中击败了89.85%的用户
     * 内存消耗：49.9 MB, 在所有 Java 提交中击败了65.52%的用户
     */
    public int minPairSum(int[] nums) {
        // 首先排序
        Arrays.sort(nums);
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        // 直接前后相加，比较出最大值即可，一定是最小最大和
        for (int i = 0; i < len / 2; i++) {
            max = Math.max(nums[i] + nums[len - i - 1], max);
        }
        return max;
    }
}
