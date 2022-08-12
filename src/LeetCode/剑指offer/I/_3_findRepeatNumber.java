package LeetCode.剑指offer.I;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组中重复的数字
 *
 * @author xoke
 * @date 2022/8/12
 */
public class _3_findRepeatNumber {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了79.43%的用户
     * 内存消耗：48.5 MB, 在所有 Java 提交中击败了93.04%的用户
     */
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        for (int num : nums) {
            arr[num]++;
            if (arr[num] > 1) {
                return num;
            }
        }
        return -1;
    }

    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了58.13%的用户
     * 内存消耗：51.2 MB, 在所有 Java 提交中击败了10.77%的用户
     */
    public int findRepeatNumber_(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
