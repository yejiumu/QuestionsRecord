package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 唯一摩尔斯密码词
 */
public class _804_uniqueMorseRepresentations {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了75.06%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了44.01%的用户
     */
    public int uniqueMorseRepresentations(String[] words) {
        // 直接查表，没什么说的
        Set<String> ans = new HashSet<>();
        String[] chars = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (String word : words) {
            int lenWord = word.length();
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < lenWord; j++) {
                str.append(chars[word.charAt(j) - 'a']);
            }
            ans.add(str.toString());
        }
        return ans.size();
    }
}
