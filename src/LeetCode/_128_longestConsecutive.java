package LeetCode;

import java.util.*;

/**
 * 最长连续序列
 *
 * @author xoke
 * @date 2022/9/27
 */
public class _128_longestConsecutive {
    /**
     * 执行用时：19 ms, 在所有 Java 提交中击败了77.05%的用户
     * 内存消耗：59.2 MB, 在所有 Java 提交中击败了48.00%的用户
     */
    public int longestConsecutive(int[] nums) {
        //直接用 set去重
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        // 遍历 set集合
        for (int num : set) {
            // 确定当前数为该连续序列的最小值
            if (!set.contains(num - 1)) {
                int curLen = 1;
                // 从该数开始寻找连续序列
                while (set.contains(++num)) {
                    curLen++;
                }
                longest = Math.max(longest, curLen);
            }
        }
        return longest;
    }
}
