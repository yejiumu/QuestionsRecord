package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 存在重复元素 II
 */
public class _219_containsNearbyDuplicate {
    /**
     * 执行用时：17 ms, 在所有 Java 提交中击败了92.15%的用户
     * 内存消耗：47 MB, 在所有 Java 提交中击败了87.95%的用户
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
