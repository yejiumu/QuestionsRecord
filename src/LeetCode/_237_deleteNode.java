package LeetCode;

/**
 * 删除链表中的节点
 */
public class _237_deleteNode {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了28.76%的用户
     * <p>
     * 狸猫换太子
     */
    public void deleteNode(ListNode node) {
        //直接node的下一结点的值赋给node
        node.val = node.next.val;
        //然后将node的下一结点删除
        node.next = node.next.next;
    }
}
