package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * N叉树的前序遍历
 *
 * 题目要求迭代，难受😖
 */
public class _589_preorder {
    /*
    /**
     * 这是递归
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了15.43%的用户
     *
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }

    //前序遍历
    public void preOrder(Node root, List<Integer> list) {
        //判空，不为空就继续操作
        if (root != null) {
            //直接加入list
            list.add(root.val);
            //并添加该节点的子节点
            for (Node number : root.children) {
                preOrder(number, list);
            }
        }
    }*/
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        while (root.children != null) {

        }
        return res;
    }
}
