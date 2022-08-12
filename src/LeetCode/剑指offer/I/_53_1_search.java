package LeetCode.剑指offer.I;

/**
 * 在排序数组中查找数字 I
 *
 * @author xoke
 * @date 2022/8/12
 */
public class _53_1_search {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：44.3 MB, 在所有 Java 提交中击败了49.90%的用户
     */
    public int search(int[] nums, int target) {
        // 获取左边界和右边界
        int left = checkRange(nums, target, true);
        int right = checkRange(nums, target, false) - 1;
        // 符合条件
        if (left <= right && right < nums.length && nums[left] == target && nums[right] == target) {
            // 返回个数即可
            return right - left + 1;
        }
        // 否则就是没找到，返回0
        return 0;
    }

    public int checkRange(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 如果target在mid左边或者要求取左边界且此时mid等于target
            // 右指针都要向左边偏移
            if (nums[mid] > target || (lower && nums[mid] == target)) {
                right = mid - 1;
                ans = mid;
            } else {
                // 否则左指针向右边偏移
                left = mid + 1;
            }
        }
        return ans;
    }
}
