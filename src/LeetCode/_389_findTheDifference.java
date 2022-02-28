package LeetCode;

import java.util.Arrays;

/**
 * 找不同
 */
public class _389_findTheDifference {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了74.43%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了26.69%的用户
     */
    public char findTheDifference(String s, String t) {
        //如果s为空，则说明t只有一个字符，直接返回即可
        if (s == null) {
            return t.charAt(0);
        }
        //字符串转字符数组，并进行排序
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        //遍历sc数组，并与tc同位置比较，如果有不同直接返回tc位置元素
        for (int i = 0; i < s.length(); i++) {
            if (sc[i] != tc[i]) {
                return tc[i];
            }
        }
        //如果上述情况都一致，则肯定是tc的最后一个元素不同，直接返回即可
        return tc[tc.length - 1];
    }
}
