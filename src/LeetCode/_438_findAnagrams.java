package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找到字符串中所有字母异位词
 */
public class _438_findAnagrams {
    /**
     * 执行用时：2128 ms, 在所有 Java 提交中击败了5.00%的用户
     * 内存消耗：42.6 MB, 在所有 Java 提交中击败了28.68%的用户
     * <p>
     * 暴力求解
     */
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> list = new ArrayList<>();
//        int lenS = s.length(), lenP = p.length();
//        char[] chars = p.toCharArray();
//        Arrays.sort(chars);
//        String criterion = new String(chars);
//        for (int i = 0; i <= lenS - lenP; i++) {
//            String temp = s.substring(i, i + lenP);
//            char[] temps = temp.toCharArray();
//            Arrays.sort(temps);
//            if (criterion.equals(new String(temps))) {
//                list.add(i);
//            }
//        }
//        return list;
//    }

    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了90.03%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了59.37%的用户
     * <p>
     * 滑动窗口🐮
     */
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen) {
            // 如果s长度小于p长度，直接返回空列表即可
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<Integer>();
        int[] count = new int[26];
        // 统计s中前pLen和p中不同的字母数量
        for (int i = 0; i < pLen; ++i) {
            ++count[s.charAt(i) - 'a'];
            --count[p.charAt(i) - 'a'];
        }
        // 不同的个数
        int differ = 0;
        for (int j = 0; j < 26; ++j) {
            if (count[j] != 0) {
                ++differ;
            }
        }
        if (differ == 0) {
            // 相同就添加
            ans.add(0);
        }
        for (int i = 0; i < sLen - pLen; ++i) {
            // 当前窗口的第一个
            int pre = s.charAt(i) - 'a';
            // 马上要滑入当前窗口的第一个
            int last = s.charAt(i + pLen) - 'a';
            if (count[pre] == 1) {
                // 因为马上要滑走
                // 所以窗口中字母s[i]的数量与字符串p中的数量从不同变得相同
                --differ;
            } else if (count[pre] == 0) {
                // 因为马上要滑走
                // 所以窗口中字母s[i]的数量与字符串p中的数量从相同变得不同
                ++differ;
            }
            // 因为要滑走，所以当前位置的字母个数减一
            --count[pre];
            if (count[last] == -1) {
                // 因为马上要滑入
                // 所以窗口中字母s[i + pLen]的数量与字符串p中的数量从不同变得相同
                --differ;
            } else if (count[last] == 0) {
                // 因为马上要滑入
                // 所以窗口中字母s[i + pLen]的数量与字符串p中的数量从相同变得不同
                ++differ;
            }
            // 因为要滑入，所以该位置的字母个数加一
            ++count[last];
            if (differ == 0) {
                // 相同就加入
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
