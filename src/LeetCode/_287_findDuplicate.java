package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 寻找重复数
 */
public class _287_findDuplicate {
    /**
     * 执行用时：16 ms, 在所有 Java 提交中击败了42.05%的用户
     * 内存消耗：59.4 MB, 在所有 Java 提交中击败了4.99%的用户
     */
//    public int findDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        int len = nums.length;
//        for (int num : nums) {
//            if (!set.add(num)) {
//                return num;
//            }
//        }
//        return nums[0];
//    }

    /**
     * 执行用时：28 ms, 在所有 Java 提交中击败了14.95%的用户
     * 内存消耗：58.3 MB, 在所有 Java 提交中击败了66.47%的用户
     */
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cnt = 0;
            // 统计小于等于mid的个数(因为元素是1 ~ n连续的)
            // 如果个数大于mid则说明有重复的，将right更新为mid - 1
            // 如果个数小于等于mid说明没有重复的，将left更新为mid + 1
            for (int num : nums) {
                if (num <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
                // 更新ans
                ans = mid;
            }
        }
        return ans;
    }
}
