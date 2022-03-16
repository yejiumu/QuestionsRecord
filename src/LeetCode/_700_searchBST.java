package LeetCode;

/**
 * 二叉搜索树中的搜索
 */
public class _700_searchBST {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了30.91%的用户
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        //看起来更简洁点
        return searchBST(root.val < val ? root.right : root.left, val);
        //看起来易懂，但是有点冗长
//        if (val > root.val) {
//            return searchBST(root.right, val);
//        } else {
//            return searchBST(root.left, val);
//        }
    }
}
