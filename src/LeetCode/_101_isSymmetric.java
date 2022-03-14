package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 对称二叉树
 */
public class _101_isSymmetric {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了47.67%的用户
     */
//    public boolean isSymmetric(TreeNode root) {
//        return check(root, root);
//    }
//
//    public boolean check(TreeNode p, TreeNode q) {
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p == null || q == null) {
//            return false;
//        }
//        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
//    }

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了23.32%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了5.03%的用户
     */
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        //创建对列，利用先进先出的特性
        Queue<TreeNode> queue = new LinkedList<>();
        //将两个结点加入对列
        queue.offer(p);
        queue.offer(q);
        //当对列不为空时，进入循环
        while (!queue.isEmpty()) {
            //将最前面的两个结点推出，进行下列操作
            p = queue.poll();
            q = queue.poll();
            //如果两结点都为空，跳过下面操作，进行下一个循环
            if (p == null && q == null) {
                continue;
            }
            //如果两个只有一个为空即两不相等，或者两结点的值不相等，直接返回false
            if ((p == null || q == null) || p.val != q.val) {
                return false;
            }
            //将该两结点的左右对称结点加入对列，进行下一个循环
            queue.offer(p.left);
            queue.offer(q.right);
            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
    }
}
