package LeetCode.CodeCarl.array;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 *
 * @author xoke
 * @date 2022/10/16
 */
public class _34_searchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return search(nums, target, mid, mid);
            }
        }
        return new int[]{-1, -1};
    }

    public int[] search(int[] nums, int target, int left, int right) {
        while (nums[left] == target) {
            left--;
        }
        while (nums[right] == target) {
            right++;
        }
        return new int[]{left, right};
    }

}
