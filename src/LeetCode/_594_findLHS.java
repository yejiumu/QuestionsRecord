package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长和谐子序列
 */
public class _594_findLHS {
    /**
     * 执行用时：16 ms, 在所有 Java 提交中击败了52.47%的用户
     * 内存消耗：43.3 MB, 在所有 Java 提交中击败了9.88%的用户
     */
    public int findLHS(int[] nums) {
        // 直接用哈希表存储
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (int num : map.keySet()) {
            // 直接判断是否有比该元素大一的元素
            if (map.containsKey(num + 1)) {
                // 有则直接相加取大者
                ans = Math.max(ans, map.get(num) + map.get(num + 1));
            }
        }
        return ans;
    }
}
