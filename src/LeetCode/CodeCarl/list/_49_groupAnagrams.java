package LeetCode.CodeCarl.list;

import java.util.*;

/**
 * 字母异位词分组
 *
 * @author xoke
 * @date 2022/10/26
 */
public class _49_groupAnagrams {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了80.43%的用户
     * 内存消耗：44.2 MB, 在所有 Java 提交中击败了80.56%的用户
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // 直接用哈希表进行分组
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            // 以当前字符串的排序后转化的字符串作为key值进行分组
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            // 然后直接在列表中进行添加即可
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
