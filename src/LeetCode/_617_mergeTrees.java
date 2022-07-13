package LeetCode;

public class _617_mergeTrees {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了29.60%的用户
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // 哪个为空，直接返回
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        // 创建一个新的结点，进行赋值
        TreeNode merged = new TreeNode(root1.val + root2.val);
        // 对该结点的左右结点进行赋值
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        // 递归返回该结点
        return merged;
    }
}
