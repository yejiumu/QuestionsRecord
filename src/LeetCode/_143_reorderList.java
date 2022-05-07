package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _143_reorderList {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了34.23%的用户
     * 内存消耗：43.4 MB, 在所有 Java 提交中击败了95.16%的用户
     * <p>
     * 链表的缺点就是不能随机存储，当我们想取末尾元素的时候，
     * 只能从头遍历一遍，很耗费时间。第二次取末尾元素的时候，又得遍历一遍。
     * 所以先来个简单粗暴的想法，把链表存储到线性表中，然后用双指针依次从头尾取元素即可。
     */
    public void reorderList(ListNode head) {
        // 判空
        if (head == null) {
            return;
        }
        // 创建线性表
        List<ListNode> list = new ArrayList<>();
        // 先遍历链表，将元素存到list中
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        // 头尾指针依次取出元素，进行连接
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // 头接尾
            list.get(left).next = list.get(right);
            // 头后移
            left++;
            // 偶数个节点的情况，会提前相遇，直接退出
            if (left == right) {
                break;
            }
            // 尾接头
            list.get(right).next = list.get(left);
            // 尾前移
            right--;
        }
        // 在另此时的尾结点(也是头节点)为空即可
        list.get(left).next = null;
    }
}
