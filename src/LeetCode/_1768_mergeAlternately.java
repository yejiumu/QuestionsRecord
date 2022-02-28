package LeetCode;

/**
 * 交替合并字符串
 */
public class _1768_mergeAlternately {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了9.01%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了5.04%的用户
     * <p>
     * String是String三兄弟里最慢的，忘记了，如果要快点，应该要用StringBuilder
     */
//    public String mergeAlternately(String word1, String word2) {
//        String res = "";
//        int m = 0, n = 0;
//        while (m != word1.length() && n != word2.length()) {
//            res += word1.charAt(m);
//            res += word2.charAt(n);
//            m++;
//            n++;
//        }
//        if (m == word1.length()) {
//            res += word2.substring(n);
//        } else {
//            res += word1.substring(m);
//        }
//        return res;
//    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了49.19%的用户
     */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        //直接比出两字符串中的短的那个的长度(没想到)
        int len = Math.min(word1.length(), word2.length());
        for (int i = 0; i < len; i++) {
            //直接使用StringBuilder的append连接字符串
            //append还可以接append
            res.append(word1.charAt(i)).append(word2.charAt(i));
        }
        //不用判断谁长谁短，直接进行拼接
        return res.append(word1.substring(len)).append(word2.substring(len)).toString();
    }
}
