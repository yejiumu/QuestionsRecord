package LeetCode;

import java.util.Stack;

/**
 * 验证回文串
 */
public class _125_isPalindrome {
    /**
     * 执行用时：219 ms, 在所有 Java 提交中击败了5.02%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了5.03%的用户
     */
//    public boolean isPalindrome(String s) {
//        s = s.toLowerCase();
//        char ch;
//        String str = "";
//        for (int i = 0; i < s.length(); i++) {
//            ch = s.charAt(i);
//            if (Character.isLetterOrDigit(ch)) {
//                str += ch;
//            }
//        }
//        int left = 0, right = str.length() - 1;
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了26.90%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了20.34%的用户
     */
    public boolean isPalindrome(String s) {
        StringBuffer str = new StringBuffer();
        s = s.toLowerCase();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(ch);
            }
        }
        StringBuffer newStr = new StringBuffer(str).reverse();
        return newStr.toString().equals(str.toString());
    }
}
