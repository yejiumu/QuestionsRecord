package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 回文链表
 */
public class _234_isPalindrome {
    /**
     * 执行用时：17 ms, 在所有 Java 提交中击败了12.04%的用户
     * 内存消耗：53.5 MB, 在所有 Java 提交中击败了47.61%的用户
     * <p>
     * 还以为挺快的，伤心😭
     */
//    public boolean isPalindrome(ListNode head) {
//        ListNode temp = head;
//        StringBuilder str = new StringBuilder("");
//        while (temp != null) {
//            str.append(temp.val);
//            temp = temp.next;
//        }
//        int len = str.length();
//        String s = str.substring(0, len / 2);
//        return s.equals(str.reverse().substring(0, len / 2));
//    }

    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了47.75%的用户
     * 内存消耗：53.3 MB, 在所有 Java 提交中击败了49.76%的用户
     */
    public boolean isPalindrome(ListNode head) {
        //创建列表，存储链表中的数据
        List<Integer> list = new ArrayList<>();
        //创建临时结点
        ListNode temp = head;
        //遍历链表，进行赋值
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        //创建双指针
        int left = 0, right = list.size() - 1;
        //如果left < right时，进入循环
        while (left < right) {
            //如果left位置与right位置上的元素不相等，直接返回false
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            //相等就各自向中间靠拢，left右移，right左移
            ++left;
            --right;
        }
        //如果left >= right时，说明已经比较完列表且都相等，直接返回true即可
        return true;
    }
}
