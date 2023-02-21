package LeetCode.剑指offer.I;

import LeetCode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 链表中倒数第k个节点
 *
 * @author xoke
 * @date 2022/8/18
 */
public class _22_getKthFromEnd {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了69.18%的用户
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 创建列表存储结点
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        // 将从倒数第k个结点开始进行连接
        int len = list.size();
        for (int i = len - k; i < len - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        // 返回倒数第k个结点
        return list.get(len - k);
    }

    public ListNode getKthFromEnd1(ListNode head, int k) {
        // 双指针
        ListNode right = head, left = head;
        for (int i = 0; i < k; i++) {
            if (right == null) {
                return null;
            }
            right = right.next;
        }
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        return left;
    }
}
