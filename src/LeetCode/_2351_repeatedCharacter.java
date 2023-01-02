package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 第一个出现两次的字母
 *
 * @author xoke
 * @date 2023/1/2
 */
public class _2351_repeatedCharacter {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了42.31%的用户
     */
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!set.add(ch)) {
                return ch;
            }
        }
        return ' ';
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了44.00%的用户
     */
    public char repeatedCharacter_(String s) {
        int index = 0;
        for (char ch : s.toCharArray()) {
            int x = ch - 'a';
            if ((index & (1 << x)) != 0) {
                return ch;
            }
            index |= 1 << x;
        }
        return ' ';
    }
}
