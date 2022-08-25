package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 算术三元组的数目
 *
 * @author xoke
 * @date 2022/8/25
 */
public class _2367_arithmeticTriplets {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了90.85%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了49.99%的用户
     */
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        // 直接哈希表
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            // 将当前数当做三数中最大数
            if (set.contains(num - 2 * diff) && set.contains(num - diff)) {
                // 如果有两个等差数，count自增
                ++count;
            }
            set.add(num);
        }
        return count;
    }
}
