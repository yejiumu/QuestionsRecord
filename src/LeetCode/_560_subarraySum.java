package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 和为 K 的子数组
 *
 * @author xoke
 * @date 2022/9/10
 */
public class _560_subarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        Map<Integer, Integer> map = new HashMap<>();
        // (0, 1)为恰好累加为k时可以相互抵消的结果
        map.put(0, 1);
        for (int num : nums) {
            // 计算前缀和
            pre += num;
            // 寻找是否有相互抵消的
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }
            // 将该前缀和加入map中
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
