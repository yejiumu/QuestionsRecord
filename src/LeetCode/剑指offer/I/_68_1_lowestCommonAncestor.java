package LeetCode.剑指offer.I;

import LeetCode.TreeNode;

/**
 * 二叉搜索树的最近公共祖先
 *
 * @author xoke
 * @date 2022/8/20
 */
public class _68_1_lowestCommonAncestor {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.6 MB, 在所有 Java 提交中击败了32.88%的用户
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 创建祖宗结点
        TreeNode ans = root;
        while (true) {
            if (p.val > ans.val && q.val > ans.val) {
                // 如果两个结点的值都大于祖宗结点
                // 将祖宗结点更新为它的右结点(增大)
                ans = ans.right;
            } else if (p.val < ans.val && q.val < ans.val) {
                // 如果两个结点的值都小于祖宗结点
                // 将祖宗结点更新为它的左结点(减小)
                ans = ans.left;
            } else {
                //此时两个结点在祖宗结点的两边
                // 此时的祖宗结点就是最近的祖宗结点，退出循环
                break;
            }
        }
        return ans;
    }
}
