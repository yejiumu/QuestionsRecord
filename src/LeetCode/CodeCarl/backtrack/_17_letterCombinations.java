package LeetCode.CodeCarl.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xoke
 * @date 2022/11/19
 */
public class _17_letterCombinations {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.4 MB, 在所有 Java 提交中击败了20.51%的用户
     */
    List<String> list = new ArrayList<>();
    StringBuilder str = new StringBuilder();
    String[] letterMap = {
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz", // 9
    };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return list;
        }
        back(digits, 0);
        return list;
    }

    public void back(String digits, int index) {
        if (index == digits.length()) {
            list.add(str.toString());
            return;
        }
        String total = letterMap[digits.charAt(index) - '0'];
        int len = total.length();
        for (int i = 0; i < len; i++) {
            str.append(total.charAt(i));
            back(digits, index + 1);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
