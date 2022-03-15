package LeetCode;

/**
 * 路径总和
 */
public class _112_hasPathSum {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了54.92%的用户
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //如果该结点为空，直接返回false
        if (root == null) {
            return false;
        }
        //如果该结点是叶子结点，判断返回该结点的值是否等于当前targetSum
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        //递归该节点的左结点和右结点，并将targetSum减去当前root的值传入参数中
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }
}
