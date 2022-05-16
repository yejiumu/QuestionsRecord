package LeetCode.WeekMatch.the_293;

import java.util.*;

/**
 * 移除字母异位词后的结果数组
 */
public class A {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        // 保存当前位置的前一个位置上的元素
        String pre = "";
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String tmp = String.valueOf(chars);
            // 判断是否相等，相等直接跳过后面步骤
            if (tmp.equals(pre)) {
                continue;
            }
            // 如果不相等，将其添加进列表中
            list.add(word);
            // 并重置前一位的值
            pre = tmp;
        }
        return list;
    }
}
