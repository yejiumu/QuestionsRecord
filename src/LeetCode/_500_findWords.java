package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 键盘行
 */
public class _500_findWords {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了74.13%的用户
     */
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        // 直接将对应字母位置上转化为其在键盘上的行数
        String index = "12210111011122000010020202";
        for (String word : words) {
            // 默认该字符串所有字母在同一行内
            boolean isValid = true;
            // 提取出该字符串第一个字母所在行数
            char init = index.charAt(Character.toLowerCase(word.charAt(0) - 'a'));
            int len = word.length();
            for (int i = 0; i < len; i++) {
                // 依次与第一个字母所在行数进行对比
                if (index.charAt(Character.toLowerCase(word.charAt(i) - 'a')) != init) {
                    // 如果不在同一行，状态更新为false
                    isValid = false;
                    // 退出循环
                    break;
                }
            }
            // 判断是否同一行
            if (isValid) {
                // 如果为同一行，添加进列表中
                list.add(word);
            }
        }
        // 创建字符串数组
        String[] ans = new String[list.size()];
        // 遍历列表，进行赋值
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
