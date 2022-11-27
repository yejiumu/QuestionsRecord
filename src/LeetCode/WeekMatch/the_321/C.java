package LeetCode.WeekMatch.the_321;

import LeetCode.ListNode;

import java.util.Collections;
import java.util.Stack;

/**
 * @author xoke
 * @date 2022/11/27
 */
public class C {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            while (!stack.isEmpty() && temp.val > stack.peek()) {
                stack.pop();
            }
            stack.push(temp.val);
            temp = temp.next;
        }
        head = new ListNode(stack.pop());
        Collections.sort(stack);
        temp = head;
        while (!stack.isEmpty()) {
            temp.next = new ListNode(stack.pop());
            temp = temp.next;
        }
        return head;
    }
}
