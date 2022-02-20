package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 */
public class _349_intersection {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了90.63%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了5.12%的用户
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int j : nums2) {
            set.add(j);
        }
        Set<Integer> list = new HashSet<>();
        for (int j : nums1) {
            if (set.contains(j)) {
                list.add(j);
            }
        }
        int[] arr = new int[list.size()];
        int i = 0;
        for (int num : list) {
            arr[i++] = num;
        }
        return arr;
    }
}
