package LeetCode;

/**
 * 反转字符串中的单词 III
 */
public class _557_reverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("qwe qwe"));
    }
    public static String reverseWords(String s) {
        String ans = "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i) || i == s.length() - 1) {
                end = i - 1;
                String str = "";
                for (int j = end; j >= start; j--) {
                    str = str + s.charAt(j);
                }
                ans = ans.concat(str);
                start = i + 1;
            }
        }
        return ans;
    }
}
