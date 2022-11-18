package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.Stack;

/**
 * 把二叉搜索树转换为累加树
 *
 * @author xoke
 * @date 2022/11/18
 */
public class _538_convertBST {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了82.41%的用户
     */
    int pre = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        root.val += pre;
        pre = root.val;
        convertBST(root.left);
        return root;
    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了7.17%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了51.83%的用户
     */
    public TreeNode convertBST_(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.right;
            } else {
                cur = stack.pop();
                cur.val += pre;
                pre = cur.val;
                cur = cur.left;
            }
        }
        return root;
    }
}
