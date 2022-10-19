package LeetCode.CodeCarl.array;

/**
 * 移除元素
 *
 * @author xoke
 * @date 2022/10/18
 */
public class _27_removeElement {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.4 MB, 在所有 Java 提交中击败了99.85%的用户
     */
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1;
        // 双指针，从两侧向中间靠拢
        while (left <= right) {
            if (nums[left] == val) {
                // 如果当前数值为 val，直接和右指针进行交换
                nums[left] = nums[right];
                // 然后右指针左移（向中间靠）
                // 这里不进行左指针右移是因为之前进行交换的右指针的值也可能是 val
                --right;
            } else {
                // 如果当前不是 val，左指针右移
                ++left;
            }
        }
        // 此时left就是不含有 val的数组的长度，且 val都被交换到了数组的尾部
        return left;
    }
}
