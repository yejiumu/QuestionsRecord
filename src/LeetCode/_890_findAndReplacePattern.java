package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查找和替换模式
 *
 * @author xoke
 * @date 2022/9/9
 */
public class _890_findAndReplacePattern {
    /*
    执行用时：1 ms, 在所有 Java 提交中击败了85.54%的用户
内存消耗：41.5 MB, 在所有 Java 提交中击败了35.43%的用户
     */
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            // 双字符串匹配
            if (check(word, pattern) && check(pattern, word)) {
                // 符合就加入列表中
                ans.add(word);
            }
        }
        return ans;
    }

    public boolean check(String p, String q) {
        Map<Character, Character> map = new HashMap<>();
        int len = p.length();
        // 将两个字符串的每个字符进行比较
        for (int i = 0; i < len; i++) {
            char x = p.charAt(i), y = q.charAt(i);
            if (!map.containsKey(x)) {
                map.put(x, y);
            } else if (map.get(x) != y) {
                return false;
            }
        }
        return true;
    }
}
