package LeetCode;

import java.util.Stack;

/**
 * 两数相加 II
 */
public class _445_addTwoNumbers {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了31.61%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了82.99%的用户
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 需要倒序，直接用栈
        Stack<Integer> one = new Stack<>();
        Stack<Integer> two = new Stack<>();
        // 将两个链表中的元素添加进两个栈中
        while (l1 != null) {
            one.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            two.push(l2.val);
            l2 = l2.next;
        }
        // 创建进位和最终链表
        int carry = 0;
        ListNode ans = null;
        // 当两个栈都不为空且进位不为0时，循环
        while (!one.isEmpty() || !two.isEmpty() || carry != 0) {
            // 取出两栈中的元素，为空默认为0
            int a = one.isEmpty() ? 0 : one.pop();
            int b = two.isEmpty() ? 0 : two.pop();
            // 计算当前数
            int cur = a + b + carry;
            // 计算进位数
            carry = cur / 10;
            // 实际记录数
            cur = cur % 10;
            // 创建临时结点
            ListNode curNode = new ListNode(cur);
            // 加入最终链表中
            curNode.next = ans;
            ans = curNode;
        }
        return ans;
    }
}
