package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串
 */
public class _205_isIsomorphic {
    /**
     * 执行用时：22 ms, 在所有 Java 提交中击败了34.34%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了34.14%的用户
     */
    public boolean isIsomorphic(String s, String t) {
        //创建两个相互映射的哈希表
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            //无论那个表有记录了后，但是发现对应的映射与表中不一致，直接返回false
            if ((s2t.containsKey(sc) && s2t.get(sc) != tc) ||
                    (t2s.containsKey(tc) && t2s.get(tc) != sc)) {
                return false;
            }
            //相一致或无记录，就记录在表中
            s2t.put(sc, tc);
            t2s.put(tc, sc);
        }
        return true;
    }
}
