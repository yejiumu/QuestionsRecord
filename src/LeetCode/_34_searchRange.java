package LeetCode;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class _34_searchRange {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：44.6 MB, 在所有 Java 提交中击败了24.59%的用户
     */
    public int[] searchRange(int[] nums, int target) {
        int left = search(nums, target, true);
        // 因为是返回大于target的第一个下标，所以要减一
        int right = search(nums, target, false) - 1;
        // 设置边界条件
        if (right < nums.length && left <= right &&
                nums[left] == target && nums[right] == target) {
            // 符合就直接返回target的左右下标
            return new int[]{left, right};
        }
        // 不符合返回[-1,-1]
        return new int[]{-1, -1};
    }

    // lower判断是否等于target
    public int search(int[] nums, int target, boolean lower) {
        // 创建左右双指针，ans默认数组长度(如果默认为0，可能会出问题)
        int left = 0, right = nums.length - 1, ans = nums.length;
        // 循环条件
        while (left <= right) {
            // 防溢出
            int mid = left + (right - left) / 2;
            // 判断mid是否大于或大于等于target
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                // 将right更新为mid
                right = mid - 1;
                // 如果是大于等于，ans在向target的第一个下标靠拢
                // 如果是大于，ans向大于target的第一个下标靠拢
                ans = mid;
            } else {
                // 如果是大于等于，left为大于mid的第一个下标
                // 如果是大于，left向大于target的第一个下标靠拢
                left = mid + 1;
            }
        }
        // 直接返回ans即可
        // 如果lower为true，ans为target的第一个下标
        // 如果lower为false，ans为大于target的第一个下标
        return ans;
    }
}
