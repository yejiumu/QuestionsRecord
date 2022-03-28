package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 颠倒字符串中的单词
 * <p>
 * 进阶：如果字符串在你使用的编程语言中是一种可变数据类型，
 * 请尝试使用 O(1) 额外空间复杂度的<原地>解法。
 */
public class _151_reverseWords {
    /**
     * 执行用时：8 ms, 在所有 Java 提交中击败了33.93%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了19.49%的用户
     */
    public String reverseWords(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
