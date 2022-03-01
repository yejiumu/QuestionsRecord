package LeetCode;

import java.util.Arrays;

/**
 * 验证外星语词典
 */
public class _953_isAlienSorted {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.9 MB, 在所有 Java 提交中击败了25.03%的用户
     */
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0; i < order.length(); i++) {
            index[order.charAt(i) - 'a'] = i;
        }
        search:
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    if (index[s1.charAt(j) - 'a'] > index[s2.charAt(j) - 'a']) {
                        return false;
                    }
                    continue search;
                }
            }
            if (s1.length() > s2.length()) {
                return false;
            }
        }
        return true;
    }
}
