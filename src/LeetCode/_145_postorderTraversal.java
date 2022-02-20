package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的后序遍历
 */
public class _145_postorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        return list;
    }

    public void postOrder(TreeNode root, List<Integer> list) {
        if (root != null) {
            postOrder(root.left, list);
            postOrder(root.right, list);
            list.add(root.val);
        }
    }
}
