package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 划分字母区间
 */
public class _763_partitionLabels {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了98.61%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了65.49%的用户
     */
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];
        int len = s.length();
        // 记录每个字母的最后一次出现的下标
        for (int i = 0; i < len; i++) {
            arr[s.charAt(i) - 'a'] = i;
        }
        // 区间的范围
        int start = 0, end = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            // 右区间为前i个字母的最大右区间
            end = Math.max(end, arr[s.charAt(i) - 'a']);
            if (i == end) {
                // 前end个字母的右区间都没有超出end
                // 所以此时end可作为当前前end个字母的终点
                list.add(end - start + 1);
                // start从end后一位开始
                start = end + 1;
            }
        }
        return list;
    }
}
