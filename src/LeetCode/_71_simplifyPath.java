package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ 2022-01-06 10:25
 */
public class _71_simplifyPath {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了92.76%的用户
     * 内存消耗：38.5 MB, 在所有 Java 提交中击败了50.30%的用户
     */
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        //Deque 为双端队列
        Deque<String> stack = new ArrayDeque<String>();
        for (String s : str) {
            if ("..".equals(s)) {
                if (!stack.isEmpty()) {
                    // 最后一个删除
                    stack.pollLast();
                }
            } else if (s.length() > 0 && !".".equals(s)) {
                // 加入到尾部
                stack.offerLast(s);
            }
        }
        StringBuilder res = new StringBuilder();
        if (stack.isEmpty()) {
            res.append('/');
        } else {
            while (!stack.isEmpty()) {
                res.append('/');
                // 第一个开始出
                res.append(stack.pollFirst());
            }
        }
        return res.toString();
    }
}
