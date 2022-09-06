package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树展开为链表
 *
 * @author xoke
 * @date 2022/9/6
 */
public class _114_flatten {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了76.64%的用户
     */
    public void flatten(TreeNode root) {
        // 用链表存储树中的结点
        List<TreeNode> list = new ArrayList<>();
        // 普通前序遍历，然后存储结点
        loop(root, list);
        int len = list.size();
        // 创建临时变量，方便进行树的重新构建
        TreeNode pre, cur;
        for (int i = 1; i < len; i++) {
            // 当 i为1时，pre为树的根结点
            pre = list.get(i - 1);
            cur = list.get(i);
            // 进行树的重构
            pre.left = null;
            pre.right = cur;
        }
    }

    public void loop(TreeNode root, List<TreeNode> list) {
        if (root != null) {
            list.add(root);
            loop(root.left, list);
            loop(root.right, list);
        }
    }
}
