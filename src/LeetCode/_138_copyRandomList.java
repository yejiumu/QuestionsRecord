package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 复制带随机指针的链表
 *
 * @author jiumu
 * @date 2023/2/23
 */
public class _138_copyRandomList {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了18.33%的用户
     */
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // 当前结点
        Node cur = head;
        // 保存和操作结点之间的连接
        Map<Node, Node> map = new HashMap<>();
        while (cur != null) {
            // key为原链表结点，value为复制后的结点
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            // 进行连接
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
