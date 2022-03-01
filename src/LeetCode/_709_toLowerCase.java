package LeetCode;

import org.junit.Test;

/**
 * 转换成小写字母
 */
@SuppressWarnings("all")
public class _709_toLowerCase {
    /**
     * 这个太bug了
     */
//    public String toLowerCase(String s) {
//        return s.toLowerCase();
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了5.01%的用户
     */
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch += 32;
            }
            str.append(ch);
        }
        return str.toString();
    }
}
