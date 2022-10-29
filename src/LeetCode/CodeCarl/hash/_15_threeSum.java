package LeetCode.CodeCarl.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 *
 * @author xoke
 * @date 2022/10/29
 */
public class _15_threeSum {
    /**
     * 执行用时：22 ms, 在所有 Java 提交中击败了49.28%的用户
     * 内存消耗：46 MB, 在所有 Java 提交中击败了15.49%的用户
     */
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length <= 2) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        // 先排序，方便操作
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            // 如果第一个数大于0，后面都大于0
            if (nums[0] > 0) {
                break;
            }
            // 相同元素跳过
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // nums[i]就是后面两个数的和
            int target = -nums[i];
            int left = i + 1, right = len - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    ++left;
                    --right;
                    // 去重，要注意看左右指针和哪一边进行相比较
                    while (left < right && nums[left] == nums[left - 1]) {
                        ++left;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        --right;
                    }
                } else if (nums[left] + nums[right] > target) {
                    --right;
                } else {
                    ++left;
                }
            }
        }
        return list;
    }
}
