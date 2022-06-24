package LeetCode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 通过删除字母匹配到字典里最长单词
 */
public class _524_findLongestWord {
    /**
     * 执行用时：26 ms, 在所有 Java 提交中击败了10.52%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了56.66%的用户
     */
    public String findLongestWord(String s, List<String> dictionary) {
        // 将list排序
        Collections.sort(dictionary, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        // 依次寻找符合条件的字符串
        for (String t : dictionary) {
            int i = 0, j = 0;
            // 遍历字符串的每个字符
            while (i < t.length() && j < s.length()) {
                if (t.charAt(i) == s.charAt(j)) {
                    // 有匹配的字符就后移
                    ++i;
                }
                // 不管怎样原字符串都要后移
                ++j;
            }
            // 判断是否与当前字符串长度相等
            if (i == t.length()) {
                return t;
            }
        }
        return "";
    }
}
