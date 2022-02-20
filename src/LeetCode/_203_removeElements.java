package LeetCode;

/**
 * 移除链表元素
 */
public class _203_removeElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        ListNode ans = new ListNode(0,head);
        ListNode temp = ans;
        while (temp.next != null){
            if (temp.val == val){
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return ans.next;
    }
}

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

