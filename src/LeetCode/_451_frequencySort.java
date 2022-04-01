package LeetCode;

import java.util.*;

/**
 * 根据字符出现频率排序
 */
public class _451_frequencySort {
    /**
     * 执行用时：11 ms, 在所有 Java 提交中击败了81.28%的用户
     * 内存消耗：42.5 MB, 在所有 Java 提交中击败了17.67%的用户
     */
    public String frequencySort(String s) {
        // 遍历字符串，记录出现的字母及其个数
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // 创建列表记录出现的所有字母
        List<Character> list = new ArrayList<>(map.keySet());
        // 并按其出现的次数排序
        list.sort((a, b) -> map.get(b) - map.get(a));
        StringBuilder str = new StringBuilder();
        // 遍历list，从次数最多的字母开始打印
        for (char c : list) {
            // 获得该字母出现的次数
            int nums = map.get(c);
            for (int i = 0; i < nums; i++) {
                // 打印
                str.append(c);
            }
        }
        // 直接返回str即可
        return str.toString();
    }
}
