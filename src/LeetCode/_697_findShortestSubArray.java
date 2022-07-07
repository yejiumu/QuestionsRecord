package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组的度
 */
public class _697_findShortestSubArray {
    /**
     * 执行用时：19 ms, 在所有 Java 提交中击败了37.23%的用户
     * 内存消耗：45.1 MB, 在所有 Java 提交中击败了87.45%的用户
     */
    public int findShortestSubArray(int[] nums) {
        // 使用三个哈希表，分别记录个数、第一次位置、最后的位置
        Map<Integer, Integer> numsCnt = new HashMap<>();
        Map<Integer, Integer> numsLastIndex = new HashMap<>();
        Map<Integer, Integer> numsFirstIndex = new HashMap<>();
        // 遍历记录
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            numsCnt.put(num, numsCnt.getOrDefault(num, 0) + 1);
            numsLastIndex.put(num, i);
            if (!numsFirstIndex.containsKey(num)) {
                numsFirstIndex.put(num, i);
            }
        }
        // 获取个数最大值
        int maxCnt = 0;
        for (int num : nums) {
            maxCnt = Math.max(maxCnt, numsCnt.get(num));
        }
        int ans = nums.length;
        // 在个数最大值的情况下，寻找范围最小值
        for (int num : nums) {
            int cnt = numsCnt.get(num);
            if (cnt != maxCnt) {
                continue;
            }
            ans = Math.min(ans, numsLastIndex.get(num) - numsFirstIndex.get(num) + 1);
        }
        return ans;
    }
}
