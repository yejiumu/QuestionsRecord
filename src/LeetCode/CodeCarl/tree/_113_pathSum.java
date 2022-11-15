package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 路径总和 II
 *
 * @author xoke
 * @date 2022/11/15
 */
public class _113_pathSum {
    List<List<Integer>> list = new ArrayList<>();

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了47.77%的用户
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return list;
        }
        travel(root, targetSum, new ArrayList<>());
        return list;
    }

    public void travel(TreeNode root, int targetSum, List<Integer> temp) {
        temp.add(root.val);
        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                list.add(new ArrayList(temp));
                return;
            }
        }
        if (root.left != null) {
            travel(root.left, targetSum - root.val, temp);
            temp.remove(temp.size() - 1);
        }
        if (root.right != null) {
            travel(root.right, targetSum - root.val, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
