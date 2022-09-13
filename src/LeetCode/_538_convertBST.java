package LeetCode;

/**
 * 把二叉搜索树转换为累加树
 *
 * @author xoke
 * @date 2022/9/13
 */
public class _538_convertBST {
    int ans = 0;

    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        // 先遍历右子树
        dfs(root.right);
        // 当前结点的值为前当前结点的值加上前面结点的和
        root.val += ans;
        // 总和重新赋值
        ans = root.val;
        // 再遍历左子树
        dfs(root.left);
    }
}
