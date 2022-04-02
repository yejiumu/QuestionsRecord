package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 */
public class _15_threeSum {
    /**
     * 执行用时：22 ms, 在所有 Java 提交中击败了49.26%的用户
     * 内存消耗：45.2 MB, 在所有 Java 提交中击败了61.63%的用户
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 判空
        if (nums == null || nums.length <= 2) {
            return res;
        }
        // 排序
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            // 如果第一个都大于0，后面的肯定的大于0的
            if (nums[i] > 0) {
                break;
            }
            // 去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int left = i + 1, right = len - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 现在要增加left，减小right(即向中间靠拢)
                    ++left;
                    --right;
                    // 去重
                    while (left < right && nums[left] == nums[left - 1]) {
                        ++left;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        --right;
                    }
                } else if (nums[left] + nums[right] < target) {
                    ++left;
                } else {
                    --right;
                }
            }
        }
        return res;
    }
}
