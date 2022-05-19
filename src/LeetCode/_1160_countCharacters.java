package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 拼写单词
 */
public class _1160_countCharacters {
    /**
     * 执行用时：55 ms, 在所有 Java 提交中击败了15.31%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了50.84%的用户
     */
    public int countCharacters(String[] words, String chars) {
        // 先创建一个字母表哈希表
        Map<Character, Integer> map = new HashMap<>();
        // 记录字母表中每个字母的个数
        for (char ch : chars.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int ans = 0;
        // 遍历字符串数组
        for (String word : words) {
            // 创建字符串哈希表
            Map<Character, Integer> tmp = new HashMap<>();
            // 统计该字符串中各个字母的个数
            for (char c : word.toCharArray()) {
                tmp.put(c, tmp.getOrDefault(c, 0) + 1);
            }
            // 默认字母表中的字母可以构成该字符串
            boolean isValid = true;
            // 遍历该字符串的每个字符
            for (char c : word.toCharArray()) {
                // 如果该字符串中有一个字母的个数大于字母表中的个数
                if (tmp.getOrDefault(c, 0) > map.getOrDefault(c, 0)) {
                    // 直接更新状态
                    isValid = false;
                    // 并退出循环
                    break;
                }
            }
            // 判断是否可以构成该字符串
            if (isValid) {
                // 如果可以，ans加上该字符串的长度
                ans += word.length();
            }
        }
        return ans;
    }
}
