package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组能形成多少数对
 *
 * @author jiumu
 * @date 2023/2/16
 */
public class _2341_numberOfPairs {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了54.00%的用户
     * 内存消耗：40.3 MB, 在所有 Java 提交中击败了40.00%的用户
     */
    public int[] numberOfPairs(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int pair = 0, alone = 0;
        for (int value : map.values()) {
            pair += value / 2;
            alone += value % 2;
        }
        return new int[]{pair, alone};
    }
}
