package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 电话号码的字母组合
 *
 * @author xoke
 * @date 2022/9/27
 */
public class _17_letterCombinations {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了48.53%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了87.78%的用户
     */
    List<String> combinations = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        // 判空
        if (digits.length() == 0) {
            return combinations;
        }
        // 将电话号码对应的字符串转化为哈希进行存储
        Map<Character, String> map = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        // 递归进行遍历搜索
        dfs(map, digits, 0, new StringBuffer());
        return combinations;
    }

    public void dfs(Map<Character, String> map, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            // 到达最后位置，直接将当前字符串加入列表即可
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            int len = letters.length();
            // 遍历当前位置可能出现的字符
            for (int i = 0; i < len; i++) {
                // 每个字符继续进行递归遍历
                combination.append(letters.charAt(i));
                dfs(map, digits, index + 1, combination);
                // 遍历完，删除当前位置的字符
                combination.deleteCharAt(index);
            }
        }
    }
}
