package LeetCode;

/**
 * 删除有序数组中的重复项 II
 */
public class _80_removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        //如果长度小于等于2，直接返回数组长度即可
        if (len <= 2) {
            return len;
        }
        // 因为前两个不用判断，所以下标从2开始
        // 其中慢指针表示处理出的数组的长度，快指针表示已经检查过的数组的长度
        // nums[fast] 表示待检查的第一个元素，
        // nums[slow - 1]为上一个应该被保留的元素所移动到的指定位置。
        int slow = 2, fast = 2;
        //如果快指针还在范围内，就进入循环
        while (fast < len) {
            // 我们需要检查上上个应该被保留的元素nums[slow−2] 是否和当前待检查元素nums[fast] 相同
            // 当且仅当nums[slow−2] = nums[fast] 时，当前待检查元素nums[fast] 不应该被保留
            // 因为此时有nums[slow - 2] = nums[slow - 1] = nums[fast]
            if (nums[slow - 2] != nums[fast]) {
                //更新慢指针位置的值
                nums[slow] = nums[fast];
                //再将慢指针右移
                ++slow;
            }
            //如果是相等的，那将快指针右移，直到找到不相等的为止
            ++fast;
        }
        return slow;
    }
}
