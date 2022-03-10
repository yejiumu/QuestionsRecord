package LeetCode;

/**
 * 合并两个有序链表
 */
public class _21_mergeTwoLists {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.7 MB, 在所有 Java 提交中击败了32.26%的用户
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //创建合成链表
        ListNode ans = new ListNode(0);
        //创建临时指针
        ListNode temp = ans;
        //只有当其中一个为空的时候才会退出，即都不为空时才会进入
        while (list1 != null && list2 != null) {
            //判断当前list1与list2的值的大小
            //将小的一方赋给temp，并后移
            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
            } else {
                temp.next = list1;
                list1 = list1.next;
            }
            //然后temp后移
            temp = temp.next;
        }
//        if (list1 == null) {
//            temp.next = list2;
//        }
//        if (list2 == null) {
//            temp.next = list1;
//        }
        //三元运算符判断其中一个是否为空，将不为空的全部赋给temp
        temp.next = list1 == null ? list2 : list1;
        //返回
        return ans.next;
    }
}
