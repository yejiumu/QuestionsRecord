package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的后序遍历
 */
public class _145_postorderTraversal {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了25.14%的用户
     */
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        postOrder(root, list);
//        return list;
//    }
//
//    public void postOrder(TreeNode root, List<Integer> list) {
//        if (root != null) {
//            postOrder(root.left, list);
//            postOrder(root.right, list);
//            list.add(root.val);
//        }
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了35.02%的用户
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        //创建列表
        List<Integer> res = new ArrayList<>();
        //如果二叉树为空，直接返回空的列表即可
        if (root == null) {
            return res;
        }
        //创建栈，利用栈的特性模仿递归
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = null;
        //如果栈不为空或者结点不为空，进入循环
        while (!stack.empty() || root != null) {
            //当结点不为空，进入循环，一开始进入循环的结点都是子树的根节点
            while (root != null) {
                //压入栈中
                stack.push(root);
                //向左遍历
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == node) {
                res.add(root.val);
                node = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }
}
