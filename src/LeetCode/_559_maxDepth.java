package LeetCode;

/**
 * N 叉树的最大深度
 *
 * @author xoke
 * @date 2022/11/14
 */
public class _559_maxDepth {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.5 MB, 在所有 Java 提交中击败了57.04%的用户
     */
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int depth = 0, len = root.children.size();
        for (int i = 0; i < len; i++) {
            depth = Math.max(depth, maxDepth(root.children.get(i)));
        }
        return depth + 1;
    }
}
