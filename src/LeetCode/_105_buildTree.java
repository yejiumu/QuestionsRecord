package LeetCode;

/**
 * 从前序与中序遍历序列构造二叉树
 *
 * @author xoke
 * @date 2022/11/15
 */
public class _105_buildTree {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了43.93%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了23.82%的用户
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 在106的基础上改一点就OK了，就是把后序的改成前序的
        return travel(inorder, 0, inorder.length, preorder, 0, preorder.length);
    }

    public TreeNode travel(int[] inorder, int inorderBegin, int inorderEnd, int[] preorder, int preorderBegin, int preorderEnd) {
        if (preorderBegin == preorderEnd) {
            return null;
        }
        int rootValue = preorder[preorderBegin];
        TreeNode root = new TreeNode(rootValue);

        if (preorderEnd - preorderBegin == 1) {
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
        // 前序遍历切割
        int leftpreorderBegin = preorderBegin + 1;
        int leftpreorderEnd = leftpreorderBegin + point - inorderBegin;
        int rightpreorderBegin = leftpreorderEnd;
        int rightpreorderEnd = preorderEnd;
        root.left = travel(inorder, leftInorderBegin, leftInorderEnd, preorder, leftpreorderBegin, leftpreorderEnd);
        root.right = travel(inorder, rightInorderBegin, rightInorderEnd, preorder, rightpreorderBegin, rightpreorderEnd);
        return root;
    }
}
