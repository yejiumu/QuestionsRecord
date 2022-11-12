package LeetCode;

import java.util.Stack;

/**
 * 相同的树
 *
 * @author xoke
 * @date 2022/11/12
 */
public class _100_isSameTree {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.9 MB, 在所有 Java 提交中击败了68.84%的用户
     */
    public boolean isSameTree_(TreeNode p, TreeNode q) {
        // 递归法
        return compare(p, q);
    }

    public boolean compare(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q == null) {
            return false;
        } else if (p == null && q != null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }
        return compare(p.left, q.left) && compare(p.right, q.right);
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了21.54%的用户
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 迭代法
        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        stack.push(q);
        while (!stack.isEmpty()) {
            TreeNode Q = stack.pop();
            TreeNode P = stack.pop();
            if (P == null && Q == null) {
                continue;
            }
            if (P == null || Q == null || P.val != Q.val) {
                return false;
            }
            stack.push(P.left);
            stack.push(Q.left);
            stack.push(P.right);
            stack.push(Q.right);
        }
        return true;
    }
}
