package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

/**
 * 二叉搜索树的第k大节点
 *
 * @author xoke
 * @date 2022/8/19
 */
public class _54_kthLargest {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了68.10%的用户
     */
    int ans = 0, count = 0;

    public int kthLargest(TreeNode root, int k) {
        dfs(root, k);
        return ans;
    }

    public void dfs(TreeNode root, int k) {
        // 首先找到此时最右边，也就是最大的数
        if (root.right != null) {
            dfs(root.right, k);
        }
        // 判断是否为指定的数
        if (++count == k) {
            ans = root.val;
            return;
        }
        // 然后往前找，找到此时第二大的数，并且递归寻找
        if (root.left != null) {
            dfs(root.left, k);
        }
    }
}
