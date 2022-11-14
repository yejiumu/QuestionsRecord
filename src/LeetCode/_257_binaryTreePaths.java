package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 *
 * @author xoke
 * @date 2022/11/14
 */
public class _257_binaryTreePaths {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了81.09%的用户
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        traversal(root, "", list);
        return list;
    }

    public void traversal(TreeNode root, String path, List<String> list) {
        if (root == null) {
            return;
        }
        // 用StringBuilder要比单用String快
        StringBuilder paths = new StringBuilder(path).append(root.val);
        if (root.left == null && root.right == null) {
            list.add(paths.toString());
        } else {
            paths.append("->");
            traversal(root.left, paths.toString(), list);
            traversal(root.right, paths.toString(), list);
        }
    }
}
