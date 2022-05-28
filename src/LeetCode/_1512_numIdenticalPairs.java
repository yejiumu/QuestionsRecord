package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 好数对的数目
 */
public class _1512_numIdenticalPairs {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了72.12%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了55.13%的用户
     */
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // 遍历数组，统计数字出现的次数
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        // 在相同数字中取两个的次数就是Cn2，就是n*(n-1)/2
        for (int times : map.values()) {
            // 统计次数即可
            ans += times * (times - 1) / 2;
        }
        return ans;
    }
}
