package LeetCode;

/**
 * 反转字符串中的单词 III
 */
public class _557_reverseWords {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了93.14%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了36.00%的用户
     *
     * 练习算法中，尽量少用API
     * 时间：O(N)
     * 空间：O(N)
     */
//    public String reverseWords(String s) {
//        String[] str = s.split(" ");
//        int len = str.length;
//        StringBuilder[] arr = new StringBuilder[len];
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < len; i++) {
//            arr[i] = new StringBuilder(str[i]);
//            arr[i].reverse();
//            res.append(arr[i]).append(" ");
//        }
//        return res.substring(0, res.length() - 1);
//    }

    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了54.87%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了27.20%的用户
     * <p>
     * 时间：O(N)，其中 N为字符串的长度。原字符串中的每个字符都会在 O(1)的时间内放入新字符串中。
     * 空间：O(N)，我们开辟了与原字符串等大的空间。
     */
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int len = s.length();
        int i = 0;
        while (i < len) {
            int start = i;
            while (i < len && s.charAt(i) != ' ') {
                ++i;
            }
            for (int j = start; j < i; j++) {
                res.append(s.charAt(start + i - 1 - j));
            }
            while (i < len && s.charAt(i) == ' ') {
                ++i;
                res.append(" ");
            }
        }
        return res.toString();
    }
}
