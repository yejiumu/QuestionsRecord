package LeetCode.CodeCarl.array;

/**
 * 搜索插入位置
 *
 * @author xoke
 * @date 2022/10/16
 */
public class _35_searchInsert {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.6 MB, 在所有 Java 提交中击败了97.19%的用户
     */
    public int searchInsert(int[] nums, int target) {
        // 还是很简单的二分查找
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
