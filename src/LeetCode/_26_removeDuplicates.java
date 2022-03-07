package LeetCode;

/**
 * 删除有序数组中的重复项
 */
public class _26_removeDuplicates {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.8 MB, 在所有 Java 提交中击败了33.74%的用户
     */
    public int removeDuplicates(int[] nums) {
        //双指针，
        int fast = 1, slow = 1, len = nums.length;
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
