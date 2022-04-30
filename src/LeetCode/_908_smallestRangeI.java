package LeetCode;

import java.util.Arrays;

/**
 * 最小差值 I
 */
public class _908_smallestRangeI {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了75.93%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了30.78%的用户
     * <p>
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了34.70%的用户
     */
    public int smallestRangeI(int[] nums, int k) {
        // 寻找最大值和最小值
        // 感觉下面这个更快，不知道是否是数据量太小
//        Arrays.sort(nums);
//        int min = nums[0], max = nums[nums.length - 1];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        // 判断max - k和min + k的差距(max - min - 2 * k)-->difference
        // 如果difference小于零，说明两者之间有重叠的地方，可以实现两者为零
        // 如果difference大于零，说明两者之间没有重叠的地方，直接相减即可
        // 思路和详情可参考https://leetcode-cn.com/problems/smallest-range-i/solution/by-fuxuemingzhu-qp4g/
        return max - min <= 2 * k ? 0 : max - min - 2 * k;
    }
}
