package LeetCode;

/**
 * 设计链表
 *
 * @author xoke
 * @date 2022/10/23
 */
public class _707_MyLinkedList {
    /**
     * 执行用时：9 ms, 在所有 Java 提交中击败了71.36%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了23.20%的用户
     */
    class MyLinkedList {

        int size;
        ListNode head;

        public MyLinkedList() {
            head = new ListNode(0);
            size = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            ListNode temp = head;
            for (int i = 0; i <= index; i++) {
                temp = temp.next;
            }
            return temp.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if (index > size) {
                return;
            }
            if (index < 0) {
                index = 0;
            }
            size++;
            ListNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            ListNode add = new ListNode(val);
            add.next = temp.next;
            temp.next = add;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }
            size--;
            if (index == 0) {
                head = head.next;
                return;
            }
            ListNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
}
