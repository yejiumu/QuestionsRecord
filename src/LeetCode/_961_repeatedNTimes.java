package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 在长度 2N 的数组中找出重复 N 次的元素
 */
public class _961_repeatedNTimes {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了45.09%的用户
     */
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        // 直接哈希表，遇到加不进去的直接返回
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        // 这个都随便，上面肯定有返回
        return -1;
    }
}
