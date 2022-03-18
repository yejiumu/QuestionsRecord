package LeetCode;

import java.util.Arrays;

/**
 * 移除元素
 */
public class _27_removeElement {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了53.22%的用户
     */
    public int removeElement(int[] nums, int val) {
        //创建双指针
        int left = 0;
        int right = nums.length - 1;
        //如果left小于等于right，加入循环
        //相等是因为，可能在同一个位置但是没有进行操作就会少一个
        while (left <= right) {
            if (nums[left] == val) {
                //如果left位置为指定值，用right位置的值将其覆盖
                nums[left] = nums[right];
                //然后right左移
                --right;
            } else {
                //不相等，left右移
                ++left;
            }
        }
        //返回left位置即可
        return left;
    }
}
