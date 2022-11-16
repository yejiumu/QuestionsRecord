package LeetCode;

/**
 * 全局倒置与局部倒置
 *
 * @author xoke
 * @date 2022/11/16
 */
public class _775_isIdealPermutation {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.46%的用户
     * 内存消耗：50.6 MB, 在所有 Java 提交中击败了55.43%的用户
     */
    public boolean isIdealPermutation(int[] nums) {
        // 因为局部倒置就是全局倒置(这个应该不难看出)，所以只要找是否存在非局部倒置即可
        // 非局部倒置：nums[i] > nums[j] (j > i + 1)
        // 即判断 nums[i] > min(nums[i + 2], nums[i + 3], ..., nums[n - 1])
        // 所以可以从数组的后面进行维护最小值，又因为 i 与 j 至少隔一个位置，所以 i 从(len - 3)开始
        int len = nums.length, min = nums[len - 1];
        for (int i = len - 3; i >= 0; i--) {
            if (nums[i] > min) {
                // 只要找到一个，直接返回false
                return false;
            }
            // 维护最小值
            min = Math.min(nums[i + 1], min);
        }
        return true;
    }
}
