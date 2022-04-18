package LeetCode;

import java.util.*;

public class _819_mostCommonWord {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了79.95%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了46.20%的用户
     */
    public String mostCommonWord(String paragraph, String[] banned) {
        // 将禁用单词存入set集合中
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        // 将分隔符号替换为空格
        paragraph = paragraph.replace("!", " ")
                .replace("?", " ").replace("'", " ")
                .replace(",", " ").replace(";", " ")
                .replace(".", " ").trim();
        // 转换会字符串数组
        String[] splits = paragraph.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        String res = "";
        int max = 0;
        // 遍历字符串数组
        for (String split : splits) {
            // 如果禁用集合中没有该字符串，或者不是空字符串，就继续运行
            if (!ban.contains(split) && split.length() > 0) {
                // map中没有就加入默认次数为0，有就在原来的基础上加一
                map.put(split, map.getOrDefault(split, 0) + 1);
                // 并且每次都与最大值进行比较
                if (map.get(split) > max) {
                    // 如果有更大的，进行更新
                    max = map.get(split);
                    res = split;
                }
            }
        }
        return res;
    }
}
