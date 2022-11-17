package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉搜索树中的众数
 *
 * @author xoke
 * @date 2022/11/17
 */
public class _501_findMode {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了53.09%的用户
     */
    List<Integer> list = new ArrayList<>();
    int maxCount = 0, count = 0;
    TreeNode pre = null;

    public int[] findMode(TreeNode root) {
        travel(root);
        int size = list.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void travel(TreeNode root) {
        if (root == null) {
            return;
        }
        travel(root.left);
        int cur = root.val;
        if (pre == null || cur != pre.val) {
            count = 1;
        } else {
            count++;
        }
        if (count > maxCount) {
            list.clear();
            list.add(cur);
            maxCount = count;
        } else if (count == maxCount) {
            list.add(cur);
        }
        pre = root;
        travel(root.right);
    }
}
