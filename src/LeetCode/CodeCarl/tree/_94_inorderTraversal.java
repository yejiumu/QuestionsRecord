package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的中序遍历
 */
public class _94_inorderTraversal {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了21.79%的用户
     */
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        inOrder(root, list);
//        return list;
//    }
//
//    public void inOrder(TreeNode root, List<Integer> list) {
//        if (root != null) {
//            inOrder(root.left, list);
//            list.add(root.val);
//            inOrder(root.right, list);
//        }
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了20.37%的用户
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        //创建列表
        List<Integer> res = new ArrayList<>();
        //如果二叉树为空，直接返回空的列表即可
        if (root == null) {
            return res;
        }
        //创建栈，利用栈的特性模仿递归
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        //如果栈不为空或者结点不为空，进入循环
        while (!stack.empty() || node != null) {
            //当结点不为空，进入循环，一开始进入循环的结点都是子树的根节点
            while (node != null) {
                //压入栈中
                stack.push(node);
                //向左遍历
                node = node.left;
            }
            //如果该结点的左结点为空，则将其推出
            node = stack.pop();
            //添加进列表中
            res.add(node.val);
            //赋值该结点的右结点
            node = node.right;
            //接着判断是否为空，即是否有子树或者子结点
        }
        return res;
    }
}
