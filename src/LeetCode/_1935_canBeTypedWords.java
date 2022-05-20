package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 可以输入的最大单词数
 */
public class _1935_canBeTypedWords {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了58.54%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了71.27%的用户
     */
    public int canBeTypedWords(String text, String brokenLetters) {
        // 创建哈希表，把坏了的键存入
        Map<Character, Integer> map = new HashMap<>();
        for (char broke : brokenLetters.toCharArray()) {
            map.put(broke, 1);
        }
        int ans = 0;
        // 将每个单词分开
        String[] arr = text.split(" ");
        for (String s : arr) {
            // 默认每个单词都可以输入
            boolean isValid = true;
            // 遍历单词每个字符
            for (char ch : s.toCharArray()) {
                // 如果能在哈希表中找到，说明不能被输入
                if (map.getOrDefault(ch, 0) == 1) {
                    // 更新状态
                    isValid = false;
                    // 然后直接退出当前循环
                    break;
                }
            }
            // 判断是否可以被输入
            if (isValid) {
                // 能则ans加一
                ans++;
            }
        }
        return ans;
    }
}
