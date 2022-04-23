package LeetCode;

import java.util.Arrays;

/**
 * 寻找旋转排序数组中的最小值
 */
public class _153_findMin {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了11.73%的用户
     * <p>
     * 题目要求应该是要用二分，可是数据量没必要😁
     */
//    public int findMin(int[] nums) {
//        int min = 5001;
//        for (int num : nums) {
//            if (num < min) {
//                min = num;
//            }
//        }
//        return min;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了49.54%的用户
     */
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
