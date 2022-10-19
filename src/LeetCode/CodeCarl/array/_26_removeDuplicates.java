package LeetCode.CodeCarl.array;

/**
 * 删除有序数组中的重复项
 *
 * @author xoke
 * @date 2022/10/19
 */
public class _26_removeDuplicates {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.9 MB, 在所有 Java 提交中击败了76.61%的用户
     */
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        // 快慢指针
        int slow = 1, fast = 1;
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                // 遇到不同的数字，将快指针的数值赋值给慢指针
                nums[slow] = nums[fast];
                // 只有遇到不同数字，慢指针才会右移
                ++slow;
            }
            // 每次快指针都会右移
            ++fast;
        }
        return slow;
    }
}
