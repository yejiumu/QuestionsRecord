package LeetCode;

/**
 * 二叉树着色游戏
 *
 * @author jiumu
 * @date 2023/2/3
 */
public class _1145_btreeGameWinningMove {
    private int x, rsz, lsz;

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了98.68%的用户
     */
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        this.x = x;
        dfs(root);
        return Math.max(Math.max(rsz, lsz), n - 1 - rsz - lsz) * 2 > n;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ls = dfs(root.left);
        int rs = dfs(root.right);
        if (root.val == x) {
            lsz = ls;
            rsz = rs;
        }
        return ls + rs + 1;
    }
}
