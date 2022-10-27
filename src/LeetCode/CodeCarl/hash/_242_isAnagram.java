package LeetCode.CodeCarl.hash;

import java.util.Arrays;

/**
 * 有效的字母异位词
 *
 * @author xoke
 * @date 2022/10/26
 */
public class _242_isAnagram {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了82.52%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了57.68%的用户
     */
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        s = new String(sc);
        t = new String(tc);
        return s.equals(t);
    }
}
