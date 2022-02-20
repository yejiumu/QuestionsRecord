package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Bigram 分词
 */
public class _1078_findOcurrences {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：36.6 MB, 在所有 Java 提交中击败了36.75%的用户
     */
    public String[] findOcurrences(String text, String first, String second) {
        String[] str = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length - 2; i++) {
            if (str[i].equals(first) && str[i + 1].equals(second)) {
                list.add(str[i + 2]);
            }
        }
        String[] result = new String[list.size()];
        int i = 0;
        for (String s : list) {
            result[i++] = s;
        }
        return result;
    }
}
