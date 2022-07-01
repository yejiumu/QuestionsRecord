package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 两两交换链表中的节点
 */
public class _24_swapPairs {
    //    public ListNode swapPairs(ListNode head) {
//        List<ListNode> list = new ArrayList<>();
//        while (head != null) {
//            list.add(head);
//            head = head.next;
//        }
//        int len = list.size();
//        for (int i = 0; i < len - 1; i += 2) {
//            ListNode temp = list.get(i);
//            list.set(i, list.get(i + 1));
//            if (i > 0) {
//                list.get(i - 1).next = list.get(i);
//            }
//            list.set(i + 1, temp);
//            list.get(i).next = list.get(i + 1);
//        }
//        return list.get(0);
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了57.72%的用户
     */
    public ListNode swapPairs(ListNode head) {
        // 创建头结点的前指针
        ListNode pre = new ListNode(0, head);
        ListNode temp = pre;
        // 循环条件
        while (temp.next != null && temp.next.next != null) {
            // 进行交换的两个结点
            ListNode one = temp.next;
            ListNode two = temp.next.next;
            // 进行交换和赋值
            temp.next = two;
            one.next = two.next;
            two.next = one;
            temp = one;
        }
        // 返回前指针的后移结点，就是头结点
        return pre.next;
    }
}
