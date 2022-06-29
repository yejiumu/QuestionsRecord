package LeetCode;

import java.util.*;

/**
 * 有序数组中的单一元素
 */
public class _540_singleNonDuplicate {
    /**
     * 执行用时：13 ms, 在所有 Java 提交中击败了22.30%的用户
     * 内存消耗：51.6 MB, 在所有 Java 提交中击败了5.08%的用户
     */
//    public int singleNonDuplicate(int[] nums) {
//        int len = nums.length;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (int num : map.keySet()) {
//            if (map.get(num) != 2) {
//                return num;
//            }
//        }
//        return -1;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：47.1 MB, 在所有 Java 提交中击败了57.00%的用户
     */
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // 这里太妙了
            // 当 mid 是偶数时，mid + 1 = mid ^ 1
            // 当 mid 是奇数时，mid - 1 = mid ^ 1
            // 而且不会数组越界，真香
            if (nums[mid] == nums[mid ^ 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
