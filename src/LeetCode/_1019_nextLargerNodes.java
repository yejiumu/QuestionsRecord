package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 链表中的下一个更大节点
 */
public class _1019_nextLargerNodes {
    /**
     * 执行用时：53 ms, 在所有 Java 提交中击败了36.21%的用户
     * 内存消耗：45.1 MB, 在所有 Java 提交中击败了33.46%的用户
     */
    public int[] nextLargerNodes(ListNode head) {
        // 将链表中的数据存入列表中，方便从后往前进行操作
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        // 创建单调栈，寻找右边第一个比自己大的元素
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            // 如果栈不为空，且栈顶小于等于当前元素
            while (!stack.isEmpty() && stack.peek() <= list.get(i)) {
                // 抛出栈顶
                stack.pop();
            }
            // 判断栈是否为空
            // 如果为空，说明栈中没有比该元素大的数，默认为0
            // 如果不为空，说明此时栈顶元素比该元素大，返回栈顶
            ans[i] = stack.isEmpty() ? 0 : stack.peek();
            // 将当前元素推入栈中
            stack.push(list.get(i));
        }
        // 返回数组即可
        return ans;
    }
}
