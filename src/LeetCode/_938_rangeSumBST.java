package LeetCode;

/**
 * 二叉搜索树的范围和
 *
 * @author xoke
 * @date 2022/8/8
 */
public class _938_rangeSumBST {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了52.91%的用户
     * 内存消耗：48.7 MB, 在所有 Java 提交中击败了75.50%的用户
     */
    public int rangeSumBST_(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        // 每次递归该结点的左右结点
        int sum = rangeSumBST_(root.right, low, high) + rangeSumBST_(root.left, low, high);
        // 如果该结点在范围内，累加即可
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        return sum;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：48.8 MB, 在所有 Java 提交中击败了50.11%的用户
     * <p>
     * 官方题解还是牛逼，每次比较缩小范围
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        // 将根节点定在范围内
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        // 递归该根节点的值与符合条件的左右结点的值的和
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
