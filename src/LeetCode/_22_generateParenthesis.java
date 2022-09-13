package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 *
 * @author xoke
 * @date 2022/9/13
 */
public class _22_generateParenthesis {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了75.95%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了59.85%的用户
     */
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return ans;
    }

    public void dfs(int left, int right, String str) {
        // 左右两括号都不剩余，递归终止
        if (left == 0 && right == 0) {
            ans.add(str);
            return;
        }
        // 如果左括号还剩余，先拼接左括号
        if (left > 0) {
            dfs(left - 1, right, str + "(");
        }
        // 如果右括号剩余大于左括号，可以拼接右括号
        if (right > left) {
            dfs(left, right - 1, str + ")");
        }
    }
}
