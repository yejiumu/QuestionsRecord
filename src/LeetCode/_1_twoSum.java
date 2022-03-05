package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class _1_twoSum {
    /**
     * 执行用时：55 ms, 在所有 Java 提交中击败了26.42%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了79.06%的用户
     */
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[0];
//    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.36%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了37.04%的用户
     */
    public int[] twoSum(int[] nums, int target) {
        //创建哈希表存储数据
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            //如果哈希表中有target - nums[i]，直接创建并返回一个新的数组
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            //没有就将nums[i]和下标放入
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
