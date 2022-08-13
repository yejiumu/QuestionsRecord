package LeetCode.剑指offer.I;

import java.util.HashMap;
import java.util.Map;

/**
 * 第一个只出现一次的字符
 *
 * @author xoke
 * @date 2022/8/13
 */
public class _50_firstUniqChar {
    /**
     * 执行用时：24 ms, 在所有 Java 提交中击败了42.15%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了99.76%的用户
     */
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int len = s.length();
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return ' ';
    }
}
