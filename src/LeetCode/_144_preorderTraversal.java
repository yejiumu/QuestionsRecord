package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的前序遍历
 */
public class _144_preorderTraversal {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了53.30%的用户
     */
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        preOrder(root, list);
//        return list;
//    }
//
//    public void preOrder(TreeNode root, List<Integer> list) {
//        if (root != null) {
//            list.add(root.val);
//            preOrder(root.left, list);
//            preOrder(root.right, list);
//        }
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了46.11%的用户
     */
    public List<Integer> preorderTraversal(TreeNode root) {
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
                //添加进列表中
                res.add(node.val);
                //压入栈中
                stack.push(node);
                //向左遍历
                node = node.left;
            }
            //如果该结点的左结点为空，则将其推出，并赋值该结点的右结点
            //接着判断是否为空，即是否有子树或者子结点
            node = stack.pop();
            node = node.right;
        }
        return res;
    }
}
