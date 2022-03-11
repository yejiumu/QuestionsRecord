package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * N叉树的前序遍历
 * <p>
 * 题目要求迭代，难受😖
 */
public class _589_preorder {
    /**
     * 这是递归
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了15.43%的用户
     */
//    public List<Integer> preorder(Node root) {
//        List<Integer> res = new ArrayList<>();
//        preOrder(root, res);
//        return res;
//    }
//
//    //前序遍历
//    public void preOrder(Node root, List<Integer> list) {
//        //判空，不为空就继续操作
//        if (root != null) {
//            //直接加入list
//            list.add(root.val);
//            //并添加该节点的子节点
//            for (Node number : root.children) {
//                preOrder(number, list);
//            }
//        }
//    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了31.63%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了46.55%的用户
     * <p>
     * 1、二叉树的非递归遍历是每次将当前结点右孩子节点和左孩子节点依次压入栈中，注意是先右后左
     * 2、然后将出栈节点输出，并且在将其右子节点和左子节点压入栈中
     * 3、推广到N叉树，就是将当前结点的孩子节点由右到左依次压入栈中
     * 4、然后将出栈节点输出，并且将其孩子节点依次压入栈中
     * 5、时间复杂度O（N），空间复杂度O（N）
     */
    public List<Integer> preorder(Node root) {
        //创建列表
        List<Integer> res = new ArrayList<Integer>();
        //如果根节点为空，直接返回刚刚创建的列表(空)
        if (root == null) {
            return res;
        }
        //创建栈，模仿依次遍历，但是注意要倒序入栈，出栈时即为正确前序遍历结果
        Stack<Node> stack = new Stack<>();
        //首先将根节点入栈
        stack.push(root);
        //如果不为空，进入循环
        while (!stack.isEmpty()) {
            //将当前节点弹出
            Node node = stack.pop();
            //加入进列表中
            res.add(node.val);
            //继续冲后往前遍历该节点的子节点
            for (int i = node.children.size() - 1; i >= 0; i--) {
                //并将它们压入栈中
                stack.push(node.children.get(i));
            }
        }
        //仔细想想可以发现，上述循环就是从后往前压入栈，出来的顺序就是从前往后，然后加入列表，
        //出栈的时候又将该节点的子节点从后往前压入栈，一直循环至栈空(即遍历完成)
        return res;
    }
}
