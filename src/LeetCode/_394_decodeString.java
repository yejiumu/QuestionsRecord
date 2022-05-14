package LeetCode;

import java.util.Stack;

/**
 * 字符串解码
 */
public class _394_decodeString {
    public String decodeString(String s) {
        // String三兄贵最快的
        StringBuffer ans = new StringBuffer();
        // 数字一个栈
        Stack<Integer> multiStack = new Stack<>();
        // 字母一个栈
        Stack<StringBuffer> ansStack = new Stack<>();
        // 初始化数字
        int multi = 0;
        // 遍历字符串进行操作
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                multi = multi * 10 + c - '0';
            } else if (c == '[') {
                ansStack.add(ans);
                multiStack.add(multi);
                ans = new StringBuffer();
                multi = 0;
            } else if (Character.isAlphabetic(c)) {
                ans.append(c);
            } else {
                StringBuffer ansTmp = ansStack.pop();
                int tmp = multiStack.pop();
                for (int i = 0; i < tmp; i++) {
                    ansTmp.append(ans);
                }
                ans = ansTmp;
            }
        }
        return ans.toString();
    }
}
