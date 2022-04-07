package LeetCode;

/**
 * 旋转字符串
 */
public class _796_rotateString {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了17.33%的用户
     */
//    public boolean rotateString(String s, String goal) {
//        StringBuilder ans = new StringBuilder(s);
//        int len = s.length();
//        int num = 0;
//        while (num++ != len - 1) {
//            char ch = s.charAt(num - 1);
//            ans.deleteCharAt(num - 1).append(ch);
//            if (ans.toString().equals(goal)) {
//                return true;
//            }
//        }
//        return false;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了39.68%的用户
     */
    public boolean rotateString(String s, String goal) {
        // 两字符串长度不相等，直接返回false
        if (s.length() != goal.length()) {
            return false;
        }
        // (s + s)的子字符串已经包含了goal的所有情况，直接调用函数即可
        return (s + s).contains(goal);
    }
}
