package LeetCode;

/**
 * 二叉搜索树的最近公共祖先
 */
public class _235_lowestCommonAncestor {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了52.51%的用户
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //创建祖宗结点
        TreeNode ancestor = root;
        //默认一直循环，直到符合某个条件退出
        while (true) {
            if (p.val > ancestor.val && q.val > ancestor.val) {
                //如果两个结点的值都大于祖宗结点，将祖宗结点更新为它的右结点(增大)
                ancestor = ancestor.right;
            } else if (p.val < ancestor.val && q.val < ancestor.val) {
                //如果两个结点的值都小于祖宗结点，将祖宗结点更新为它的左结点(减小)
                ancestor = ancestor.left;
            } else {
                //此时两个结点在祖宗结点的两边，此时的祖宗结点就是最近的祖宗结点，退出循环
                break;
            }
        }
        return ancestor;
    }
}
