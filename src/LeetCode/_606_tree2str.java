package LeetCode;

import java.util.Stack;

/**
 * 根据二叉树创建字符串
 */
public class _606_tree2str {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了74.52%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了18.09%的用户
     */
    public static String tree2str(TreeNode root) {
        if (root == null) {
            //如果结点为空，返回空字符串
            return "";
        }
        if (root.left == null && root.right == null) {
            //如果该结点没有子结点，返回该结点的值的字符串类型
            return Integer.toString(root.val);
        }
        if (root.right == null) {
            //如果该结点的右结点为空，添加左结点和括号即可
            return new StringBuilder().append(root.val).append("(")
                    .append(tree2str(root.left)).append(")").toString();
        }
        //否则，加入左结点和右结点和括号
        return new StringBuilder().append(root.val).append("(")
                .append(tree2str(root.left)).append(")(").append(tree2str(root.right)).append(")").toString();
    }
}
