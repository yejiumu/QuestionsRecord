package LeetCode.CodeCarl.tree;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证二叉搜索树
 *
 * @author xoke
 * @date 2022/11/16
 */
@SuppressWarnings("all")
public class _98_isValidBST {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了21.32%的用户
     */
//    long max = Long.MIN_VALUE;
//
//    public boolean isValidBST(TreeNode root) {
//        // 递归实现，但是上面的 max 是专门改成的 LONG 类型的最小值，因为题目中给出了 INT 的最小值
//        // 但是万一给出的是 LONG 的最小值呢？所以需要进行改进
//        if (root == null) {
//            return true;
//        }
//        boolean left = isValidBST(root.left);
//        if (max < root.val) {
//            max = root.val;
//        } else {
//            return false;
//        }
//        boolean right = isValidBST(root.right);
//        return left && right;
//    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了87.00%的用户
     */
    // 记录前一个结点
    TreeNode pre = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = isValidBST(root.left);
        if (pre != null && pre.val >= root.val) {
            return false;
        }
        // 第一次赋值是最左结点
        pre = root;
        boolean right = isValidBST(root.right);
        return left && right;
    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了27.66%的用户
     * 内存消耗：40.7 MB, 在所有 Java 提交中击败了95.48%的用户
     */
    public boolean isValidBST_(TreeNode root) {
        // 递归列表实现
        List<Integer> list = new ArrayList<>();
        travel(root, list);
        int len = list.size();
        for (int i = 1; i < len; i++) {
            if (list.get(i - 1) >= list.get(i)) {
                return false;
            }
        }
        return true;
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
