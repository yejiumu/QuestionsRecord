package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.Arrays;

/**
 * 从中序与后序遍历序列构造二叉树
 *
 * @author xoke
 * @date 2022/11/15
 */
public class _106_buildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // 优化
        // return travel(inorder, 0, inorder.length, postorder, 0, postorder.length);
        // 判空
        if (postorder.length == 0) {
            return null;
        }
        int len = postorder.length;
        // 取后序遍历数组的最后一个元素作为根结点
        int rootValue = postorder[len - 1];
        TreeNode root = new TreeNode(rootValue);
        // 叶子结点
        if (len == 1) {
            return root;
        }
        // 找切割点
        int point;
        for (point = 0; point < len; point++) {
            if (inorder[point] == rootValue) {
                break;
            }
        }
        // 中序数组的切割
        // 左闭右开区间：[0, point)
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, point);
        // [point + 1, end)
        int[] rightInorder = Arrays.copyOfRange(inorder, point + 1, len);
        // 后序数组切割
        int[] leftPostorder = Arrays.copyOfRange(postorder, 0, point);
        // 最后一个元素不要，是当前根结点
        int[] rightPostorder = Arrays.copyOfRange(postorder, point, len - 1);
        // 递归构造树
        root.left = buildTree(leftInorder, leftPostorder);
        root.right = buildTree(rightInorder, rightPostorder);
        return root;
    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了40.37%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了37.73%的用户
     */
    public TreeNode travel(int[] inorder, int inorderBegin, int inorderEnd, int[] postorder, int postorderBegin, int postorderEnd) {
        if (postorderBegin == postorderEnd) {
            return null;
        }
        int rootValue = postorder[postorderEnd - 1];
        TreeNode root = new TreeNode(rootValue);

        if (postorderEnd - postorderBegin == 1) {
            return root;
        }
        int point;
        for (point = 0; point < inorderEnd; point++) {
            if (inorder[point] == rootValue) {
                break;
            }
        }
        // 中序遍历切割
        int leftInorderBegin = inorderBegin;
        int leftInorderEnd = point;
        int rightInorderBegin = point + 1;
        int rightInorderEnd = inorderEnd;
        // 后序遍历切割
        int leftPostorderBegin = postorderBegin;
        int leftPostorderEnd = postorderBegin + point - inorderBegin;
        int rightPostorderBegin = leftPostorderEnd;
        int rightPostorderEnd = postorderEnd - 1;
        root.left = travel(inorder, leftInorderBegin, leftInorderEnd, postorder, leftPostorderBegin, leftPostorderEnd);
        root.right = travel(inorder, rightInorderBegin, rightInorderEnd, postorder, rightPostorderBegin, rightPostorderEnd);
        return root;
    }
}
