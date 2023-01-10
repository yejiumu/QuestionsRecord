package LeetCode;

import java.util.Arrays;

/**
 * 最短无序连续子数组
 *
 * @author xoke
 * @date 2023/1/10
 */
public class _581_findUnsortedSubarray {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了25.73%的用户
     * 内存消耗：42.8 MB, 在所有 Java 提交中击败了14.57%的用户
     */
    public int findUnsortedSubarray_(int[] nums) {
        // 判断是否为全递增
        if (isSorted(nums)) {
            return 0;
        }
        int len = nums.length;
        // 复制一个数组，进行排序
        int[] sorted = Arrays.copyOf(nums, len);
        Arrays.sort(sorted);
        int left = 0, right = len - 1;
        while (nums[left] == sorted[left]) {
            left++;
        }
        while (nums[right] == sorted[right]) {
            right--;
        }
        return right - left + 1;
    }

    public boolean isSorted(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了92.12%的用户
     * 内存消耗：42.5 MB, 在所有 Java 提交中击败了30.02%的用户
     */
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int max = nums[0], min = nums[len - 1];
        int left = 0, right = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] < max) {
                right = i;
            } else {
                max = nums[i];
            }
            if (nums[len - i - 1] > min) {
                left = len - i - 1;
            } else {
                min = nums[len - i - 1];
            }
        }
        return right - left + 1;
    }
}
