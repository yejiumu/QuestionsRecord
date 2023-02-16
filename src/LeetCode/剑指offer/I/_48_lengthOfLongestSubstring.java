package LeetCode.剑指offer.I;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长不含重复字符的子字符串
 *
 * @author jiumu
 * @date 2023/2/16
 */
public class _48_lengthOfLongestSubstring {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了54.78%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了63.11%的用户
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = s.length();
        int index = -1, res = 0;
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (index + 1 < len && !set.contains(s.charAt(index + 1))) {
                set.add(s.charAt(index + 1));
                ++index;
            }
            res = Math.max(res, index - i + 1);
        }
        return res;
    }
}
