package LeetCode;

import java.util.*;

/**
 * 字母异位词分组
 */
public class _49_groupAnagrams {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了80.25%的用户
     * 内存消耗：44.2 MB, 在所有 Java 提交中击败了71.59%的用户
     */
//    public List<List<String>> groupAnagrams(String[] strs) {
//        // 统计数目，直接创建哈希表
//        Map<String, List<String>> map = new HashMap<>();
//        // 遍历字符串数组
//        for (String str : strs) {
//            // 转化成字符数组，方便进行排序比较
//            char[] chars = str.toCharArray();
//            // 排序
//            Arrays.sort(chars);
//            // 重新转为字符串
//            String key = new String(chars);
//            // 创建一个新的列表，如果之前有就用之前的，没有就新创一个
//            List<String> list = map.getOrDefault(key, new ArrayList<>());
//            // 将当前字符串加入列表
//            list.add(str);
//            // 然后加入哈希表中，如果已经存在相同key，会进行覆盖
//            map.put(key, list);
//        }
//        // 返回map的values集合即可
//        return new ArrayList<>(map.values());
//    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            int[] counts = new int[26];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                counts[str.charAt(i) - 'a']++;
            }
            // 将每个出现次数大于 0 的字母和出现次数按顺序拼接成字符串，作为哈希表的键
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (counts[i] != 0) {
                    sb.append((char) ('a' + i));
                    sb.append(counts[i]);
                }
            }
            String key = sb.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    // 真正自己做的，好像是更简便一点
    public List<List<String>> groupAnagrams_(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
