package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉搜索树的最小绝对差
 *
 * @author xoke
 * @date 2022/11/17
 */
public class _530_getMinimumDifference {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了41.71%的用户
     */
    int min = Integer.MAX_VALUE;
    TreeNode pre = null;

    public int getMinimumDifference(TreeNode root) {
        // 直接在遍历二叉树的时候进行比较
        travel(root);
        return min;
    }

    public void travel(TreeNode root) {
        if (root == null) {
            return;
        }
        travel(root.left);
        if (pre != null) {
            min = Math.min(root.val - pre.val, min);
        }
        pre = root;
        travel(root.right);
    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了15.88%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了84.01%的用户
     */
    public int getMinimumDifference__(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        TreeNode temp = root;
        int min = Integer.MAX_VALUE;
        while (temp != null || !stack.isEmpty()) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                if (pre != null) {
                    min = Math.min(min, temp.val - pre.val);
                }
                pre = temp;
                temp = temp.right;
            }
        }
        return min;
    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了37.98%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了15.58%的用户
     */
    public int getMinimumDifference_(TreeNode root) {
        // 用列表将全部元素进行存储
        List<Integer> list = new ArrayList<>();
        travel(root, list);
        int len = list.size(), min = Integer.MAX_VALUE;
        // 然后进行遍历寻找相邻最小差
        for (int i = 1; i < len; i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }
        return min;
    }

    public void travel(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        travel(root.left, list);
        list.add(root.val);
        travel(root.right, list);
    }
}
