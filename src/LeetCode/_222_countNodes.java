package LeetCode;

/**
 * 完全二叉树的节点个数
 *
 * @author xoke
 * @date 2022/11/12
 */
public class _222_countNodes {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：43.9 MB, 在所有 Java 提交中击败了86.26%的用户
     */
    public int countNodes_(TreeNode root) {
        // 一般二叉树的统计方法
        if (root == null) {
            return 0;
        }
        return 1 + countNodes_(root.left) + countNodes_(root.right);
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：44.4 MB, 在所有 Java 提交中击败了27.74%的用户
     */
    public int countNodes(TreeNode root) {
        // 利用完全二叉树的特征
        if (root == null) {
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftH = 0, rightH = 0;
        while (left != null) {
            left = left.left;
            leftH++;
        }
        while (right != null) {
            right = right.right;
            rightH++;
        }
        if (leftH == rightH) {
            // 利用子树一定有满二叉树的特点
            return (2 << leftH) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
