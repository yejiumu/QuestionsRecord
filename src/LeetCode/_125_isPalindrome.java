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
//    public boolean isPalindrome(String s) {
//        StringBuilder str = new StringBuilder();
//        s = s.toLowerCase();
//        char ch;
//        for (int i = 0; i < s.length(); i++) {
//            ch = s.charAt(i);
//            if (Character.isLetterOrDigit(ch)) {
//                str.append(ch);
//            }
//        }
//        StringBuffer newStr = new StringBuffer(str).reverse();
//        return newStr.toString().equals(str.toString());
//    }

    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了96.40%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了42.14%的用户
     */
    public boolean isPalindrome(String s) {
        //双指针
        int left = 0, right = s.length() - 1;
        //
        while (left < right) {
            //在left < right且该元素不是字母或者数字的情况下，left右移
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            //在left < right且该元素不是字母或者数字的情况下，right左移
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                //如果当前left和right位置上的元素不相等，直接返回false
                if (Character.toLowerCase(s.charAt(left)) !=
                        Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                //如果相等，left右移，right左移
                ++left;
                --right;
            }
        }
        return true;
    }
}
