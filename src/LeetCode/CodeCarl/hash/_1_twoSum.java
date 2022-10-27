package LeetCode.CodeCarl.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 * @author xoke
 * @date 2022/10/27
 */
public class _1_twoSum {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.67%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了12.88%的用户
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
