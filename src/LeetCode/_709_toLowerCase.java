package LeetCode;

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
     * 不用函数
     * 执行用时：6 ms, 在所有 Java 提交中击败了5.37%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了5.08%的用户
     * <p>
     * 说实话有点慢
     */
    public String toLowerCase(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                str = str + (char) (s.charAt(i) + 32);
                continue;
            }
            str = str + s.charAt(i);
        }
        return str;
    }
}
