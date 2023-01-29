package LeetCode.剑指offer.II;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树中和为某一值的路径
 *
 * @author jiumu
 * @date 2023/1/29
 */
public class _34_pathSum {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.97%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了7.20%的用户
     */
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return list;
        }
        dfs(root, target, new ArrayList<>());
        return list;
    }

    public void dfs(TreeNode root, int target, List<Integer> path) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (target == root.val) {
                list.add(new ArrayList<>(path));
                return;
            }
        }
        if (root.left != null) {
            dfs(root.left, target - root.val, path);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            dfs(root.right, target - root.val, path);
            path.remove(path.size() - 1);
        }
    }
}
