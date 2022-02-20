package LeetCode;

/**
 * 替换所有的问号
 */
public class _1576_modifyString {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了5.12%的用户
     */
    public String modifyString(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '?') {
                for (char j = 'a'; j <= 'c'; j++) {
                    if ((i > 0 && ch[i - 1] == j) ||
                            (i < ch.length - 1 && ch[i + 1] == j)) {
                        continue;
                    }
                    ch[i] = j;
                    break;
                }
            }
        }
        return new String(ch);
    }
}
