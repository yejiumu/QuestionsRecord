package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 和相同的二元子数组
 *
 * @author xoke
 * @date 2022/8/6
 */
public class _930_numSubarraysWithSum {
    /**
     * 执行用时：20 ms, 在所有 Java 提交中击败了60.38%的用户
     * 内存消耗：46 MB, 在所有 Java 提交中击败了35.26%的用户
     */
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        for (int num : nums) {
            // 统计不同的前缀和的个数
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            // 累加前缀和
            sum += num;
            // 累加
            ans += map.getOrDefault(sum - goal, 0);
        }
        return ans;
    }
}
