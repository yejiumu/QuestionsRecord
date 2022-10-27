package LeetCode.CodeCarl.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 两个数组的交集 II
 *
 * @author xoke
 * @date 2022/10/27
 */
public class _350_intersect {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.34%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了95.89%的用户
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] set1 = new int[1010], set2 = new int[1010];
        for (int num : nums1) {
            set1[num]++;
        }
        for (int num : nums2) {
            set2[num]++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1010; i++) {
            if (set1[i] != 0 && set2[i] != 0) {
                for (int j = 0; j < Math.min(set1[i], set2[i]); j++) {
                    list.add(i);
                }
            }
        }
        int[] res = new int[list.size()];
        int i = 0;
        for (int num : list) {
            res[i++] = num;
        }
        return res;
    }
}
