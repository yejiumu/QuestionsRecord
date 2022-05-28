package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 差的绝对值为 K 的数对数目
 */
public class _2006_countKDifference {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了76.06%的用户
     * 内存消耗：41 MB, 在所有 Java 提交中击败了47.71%的用户
     */
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        // 遍历数组
        for (int num : nums) {
            // 统计当前元素的+-k的值的个数，并累加
            ans += map.getOrDefault(num - k, 0) +
                    map.getOrDefault(num + k, 0);
            // 然后将当前元素加入哈希表中
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
}
