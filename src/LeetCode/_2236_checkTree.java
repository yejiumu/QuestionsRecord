package LeetCode;

/**
 * 判断根结点是否等于子结点之和
 *
 * @author xoke
 * @date 2022/8/2
 */
public class _2236_checkTree {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了32.70%的用户
     */
    public boolean checkTree(TreeNode root) {
        // 不作过多解释
        return root.left.val + root.right.val == root.val;
    }
}
