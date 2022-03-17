package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 两数之和 IV - 输入 BST
 */
public class _653_findTarget {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了49.46%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了16.24%的用户
     */
    public boolean findTarget(TreeNode root, int k) {
        //创建一个set集合，将BST中的所有结点的值都传入集合中
        Set<Integer> set = new HashSet<>();
        return check(root, k, set);
    }

    //判断函数
    public boolean check(TreeNode root, int k, Set<Integer> set) {
        //如果root为空，直接返回false
        if (root == null) {
            return false;
        }
        //如果集合中有(k - root.val)，那么再加上当前结点的值就可以组合
        if (set.contains(k - root.val)) {
            return true;
        }
        //如果没有就加入当前结点的值
        set.add(root.val);
        //递归返回当前结点的左右结点的结果
        return check(root.right, k, set) || check(root.left, k, set);
    }
}
