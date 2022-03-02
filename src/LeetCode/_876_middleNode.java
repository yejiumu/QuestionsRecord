package LeetCode;

/**
 * 链表的中间结点
 */
public class _876_middleNode {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了25.13%的用户
     *
     * 双指针，妙不可言，fast是slow的两倍，fast判空时slow就是中间位置
     */
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head, fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了24.18%的用户
     */
    public ListNode middleNode(ListNode head) {
        //中间位置，无论长度是偶数还是奇数，都可以直接/2
        int mid = size(head) / 2;
        //遍历数组，直到到mid位置
        for (int i = 0; i < mid; i++) {
            //head每次后移
            head = head.next;
        }
        //直接返回head
        return head;
    }

    //求链表的长度
    public int size(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
