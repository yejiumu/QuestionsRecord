package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计一致字符串的数目
 *
 * @author xoke
 * @date 2022/11/9
 */
@SuppressWarnings("all")
public class _1684_countConsistentStrings {
    /**
     * 执行用时：11 ms, 在所有 Java 提交中击败了47.64%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了60.23%的用户
     */
//    public int countConsistentStrings(String allowed, String[] words) {
//        Map<Character, Integer> map = new HashMap<>();
//        for (char ch : allowed.toCharArray()) {
//            map.put(ch, 1);
//        }
//        int res = 0;
//        for (String s : words) {
//            boolean flag = true;
//            for (char ch : s.toCharArray()) {
//                if (!map.containsKey(ch)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                ++res;
//            }
//        }
//        return res;
//    }

    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了76.71%的用户
     * 内存消耗：42.4 MB, 在所有 Java 提交中击败了33.89%的用户
     */
    public int countConsistentStrings(String allowed, String[] words) {
        // 少点API的操作确实快一些
        boolean[] has = new boolean[128];
        for (char ch : allowed.toCharArray()) {
            has[ch] = true;
        }
        int res = 0;
        for (String s : words) {
            ++res;
            for (char ch : s.toCharArray()) {
                if (!has[ch]) {
                    --res;
                    break;
                }
            }
        }
        return res;
    }
}
