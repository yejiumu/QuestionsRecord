package LeetCode.CodeCarl.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * 划分字母区间
 *
 * @author xoke
 * @date 2022/11/28
 */
public class _763_partitionLabels {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了98.76%的用户
     * 内存消耗：40 MB, 在所有 Java 提交中击败了66.75%的用户
     */
    public List<Integer> partitionLabels(String s) {
        // 或者按照435，将每个字母划分区间，求互不重叠的边界
        int[] index = new int[26];
        List<Integer> list = new ArrayList<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            index[s.charAt(i) - 'a'] = i;
        }
        int left = 0, right = 0;
        for (int i = 0; i < len; i++) {
            right = Math.max(right, index[s.charAt(i) - 'a']);
            if (i == right) {
                list.add(right - left + 1);
                left = i + 1;
            }
        }
        return list;
    }
}
