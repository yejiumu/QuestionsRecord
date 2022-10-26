package LeetCode.CodeCarl.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * 找到字符串中所有字母异位词
 *
 * @author xoke
 * @date 2022/10/26
 */
public class _438_findAnagrams {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了87.67%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了82.15%的用户
     */
    public List<Integer> findAnagrams(String s, String p) {
        int lenS = s.length(), lenP = p.length();
        if (lenS < lenP) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < lenP; i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sCount, pCount)) {
            list.add(0);
        }
        for (int i = 0; i < lenS - lenP; i++) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + lenP) - 'a'];
            if (Arrays.equals(sCount, pCount)) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
