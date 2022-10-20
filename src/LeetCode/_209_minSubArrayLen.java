package LeetCode;

/**
 * 长度最小的子数组
 *
 * @author xoke
 * @date 2022/10/20
 */
public class _209_minSubArrayLen {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：48.6 MB, 在所有 Java 提交中击败了74.63%的用户
     */
    public int minSubArrayLen(int target, int[] nums) {
        // 滑动窗口，维护区间内的总和
        int left = 0, right = 0, res = 0;
        int len = nums.length, count = Integer.MAX_VALUE;
        while (right < len) {
            res += nums[right];
            // 循环判断区间的总和，有可能加上当前右指针的值，远超target的值
            while (res >= target) {
                // 取区间范围的最小值
                count = Math.min(right - left + 1, count);
                // 缩小区间的范围，并且维护区间总和
                res -= nums[left];
                ++left;
            }
            right++;
        }
        // 判断是否更新过count
        // 如未更新，则数组总和都未达到target
        // 如果更新过，则去更新值即可
        return count == Integer.MAX_VALUE ? 0 : count;
    }
}
