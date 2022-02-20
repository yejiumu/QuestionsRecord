package LeetCode;

/**
 * 并两个有序链表
 */
public class _21_mergeTwoLists {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：37.7 MB, 在所有 Java 提交中击败了77.60%的用户
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            } else {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
        }
        if (list1 == null) {
            temp.next = list2;
        }
        if (list2 == null) {
            temp.next = list1;
        }
        return ans.next;
    }
}
