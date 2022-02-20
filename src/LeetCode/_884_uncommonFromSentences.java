package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 两句话中的不常见单词
 */
public class _884_uncommonFromSentences {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了20.42%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了10.37%的用户
     */
    public String[] uncommonFromSentences(String s1, String s2) {
        String string = s1 + " " + s2;
        String[] ss = string.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : ss) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        List<String> list = new ArrayList<>();
        for (String str : map.keySet()) {
            if (map.get(str) < 2) {
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
