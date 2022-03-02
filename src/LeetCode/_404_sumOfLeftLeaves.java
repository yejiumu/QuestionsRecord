package LeetCode;

/**
 * 左叶子之和
 */
public class _404_sumOfLeftLeaves {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了25.10%的用户
     */
    public int sumOfLeftLeaves(TreeNode root) {
        //如果节点为空，直接返回0
        if (root == null) {
            return 0;
        }
        int res = 0;
        //判断给节点是否为左节点
        if (root.left != null && root.left.left == null && root.left.right == null) {
            res = root.left.val;
        }
        //继续递归，递归完全部节点，直接返回结果
        return sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left) + res;
    }
}
