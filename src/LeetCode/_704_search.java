package LeetCode;

/**
 * 二分查找
 */
public class _704_search {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了40.49%的用户
     */
    public int search(int[] nums, int target) {
        // 创建左右两指针
        int left = 0, right = nums.length - 1;
        // 设置循环条件
        while (left <= right) {
            // 防止两个数太大相加超出范围
            int mid = left + (right - left) / 2;
            // 设置边界转换条件
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                // 如果找到，直接返回下标
                return mid;
            }
        }
        // 如果找不到，返回-1
        return -1;
    }
}
