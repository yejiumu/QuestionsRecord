package LeetCode;

import java.util.Arrays;

/**
 * 特殊数组的特征值
 */
public class _1608_specialArray {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了79.94%的用户
     * 内存消耗：38.9 MB, 在所有 Java 提交中击败了82.12%的用户
     */
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0, right = len;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (count(nums, mid, len) < mid) {
                right = mid - 1;
            } else if (count(nums, mid, len) > mid) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int count(int[] nums, int mid, int len) {
        int k = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] >= mid) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}
