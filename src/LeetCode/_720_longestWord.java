package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 词典中最长的单词
 */
public class _720_longestWord {
    /**
     * 执行用时：14 ms, 在所有 Java 提交中击败了57.51%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了34.69%的用户
     */
    public String longestWord(String[] words) {
        //将数组按长度顺序排序，长度相同按字典顺序
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return b.compareTo(a);
            }
        });
        String longest = "";
        //创建set集合
        Set<String> set = new HashSet<>();
        //添加空串，为了加上长度为1的字符串
        set.add("");
        int len = words.length;
        for (int i = 0; i < len; i++) {
            String word = words[i];
            //如果之前有加入比此字符串长度减一的字符串，就把该字符串加入集合
            if (set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                //并将最长字符串更新，或许会想到长度一样的怎么办
                //长度一样的在之前已经加入，并已经按字典顺序排好，后面加入的一定是比前面小的
                longest = word;
            }
        }
        return longest;
    }
}
