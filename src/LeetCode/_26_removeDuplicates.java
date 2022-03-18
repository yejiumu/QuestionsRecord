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
        //双指针，用快指针的值覆盖慢指针，第一个元素保留，所以从第二个开始替换
        int fast = 1, slow = 1, len = nums.length;
        //当快指针没有越界时，进入循环
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                //只有不相等的时候，才需要进行替换，慢指针才需要右移
                nums[slow] = nums[fast];
                slow++;
            }
            //如果相等就快指针右移
            fast++;
        }
        //返回慢指针位置即可
        return slow;
    }
}
