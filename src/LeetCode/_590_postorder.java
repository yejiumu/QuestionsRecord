package LeetCode;

import java.util.*;

/**
 * N 叉树的后序遍历
 */
public class _590_postorder {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了24.29%的用户
     * <p>
     * 后序遍历递归还是挺简单的
     */
//    public List<Integer> postorder(Node root) {
//        List<Integer> res = new ArrayList<>();
//        postOrder(root, res);
//        return res;
//    }
//
//    public void postOrder(Node root, List<Integer> res) {
//        if (root != null) {
//            for (Node num : root.children) {
//                postOrder(num, res);
//            }
//            res.add(root.val);
//        }
//    }
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了18.81%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了46.71%的用户
     */
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<Node>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.peek();
            /* 如果当前节点为叶子节点或者当前节点的子节点已经遍历过 */
            if (node.children.size() == 0 || visited.contains(node)) {
                stack.pop();
                res.add(node.val);
                continue;
            }
            for (int i = node.children.size() - 1; i >= 0; --i) {
                stack.push(node.children.get(i));
            }
            visited.add(node);
        }
        return res;
    }
}
