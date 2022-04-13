package LeetCode;

/**
 * 搜索插入位置
 */
public class _35_searchInsert {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了8.35%的用户
     */
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1, ans = len;
        // 循环条件
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 寻找大于等于target的最小下标
            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
