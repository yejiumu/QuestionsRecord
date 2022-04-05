package LeetCode;

/**
 * 搜索旋转排序数组
 */
public class _33_search {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了60.68%的用户
     */
    public int search(int[] nums, int target) {
        int len = nums.length;
        // 如果长度为1，直接判断
        if (len == 1) {
            return nums[0] == target ? 0 : -1;
        }
        // 创建左右两指针
        int left = 0, right = len - 1;
        // 循环条件
        while (left <= right) {
            // 防越界
            int mid = left + (right - left) / 2;
            // 如果找到，直接返回下标即可
            if (nums[mid] == target) {
                return mid;
            }
            // 因为会换位置，所以将mid与第一个元素比较，判断左半边和右半边是有序还是无序
            if (nums[0] <= nums[mid]) {
                // 左半边有序，右半边无序
                // 判断target是否在[ nums[0], nums[mid] )
                if (nums[0] <= target && target < nums[mid]) {
                    // 在，right更新为mid - 1
                    right = mid - 1;
                } else {
                    // 不在，left更新为mid + 1
                    left = mid + 1;
                }
            } else {
                // 左半边无序，右半边有序
                // 判断target是否在( nums[mid], nums[len - 1] ]
                if (nums[mid] < target && target <= nums[len - 1]) {
                    // 在，left更新为mid + 1
                    left = mid + 1;
                } else {
                    // 不在，right更新为mid - 1
                    right = mid - 1;
                }
            }
        }
        // 找不到返回-1
        return -1;
    }
}
