package LeetCode;

/**
 * 寻找峰值
 */
public class _162_findPeakElement {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.4 MB, 在所有 Java 提交中击败了72.24%的用户
     */
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        // 如果只有一个元素，直接返回0即可
        if (len == 1) {
            return 0;
        }
        // 创建左右双指针
        int left = 0, right = len - 1;
        while (left < right) {
            // 防越界
            int mid = left + (right - left) / 2;
            // 判断[ nums[mid], nums[mid + 1] ]是否递减
            if (nums[mid] > nums[mid + 1]) {
                // 如果递减，那么[ nums[left], nums[mid] ]中一定有峰值
                // 将right更新为mid
                right = mid;
            } else {
                // 如果递增，那么( nums[mid], nums[right] ]中一定有峰值
                // 将left更新为mid + 1
                left = mid + 1;
            }
        }
        // 此时区间为缩小为一个点，left == right
        return left;
    }
}
