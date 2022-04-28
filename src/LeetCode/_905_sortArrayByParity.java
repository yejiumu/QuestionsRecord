package LeetCode;

public class _905_sortArrayByParity {
    /**
     * 行用时：1 ms, 在所有 Java 提交中击败了70.29%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了77.72%的用户
     * <p>
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了57.80%的用户
     */
    public int[] sortArrayByParity(int[] nums) {
        // 双指针
        int even = 0, odd = nums.length - 1;
        while (even < odd) {
            // 跳过连续的偶数
            while (even < odd && nums[even] % 2 == 0) {
                even++;
            }
            // 跳过连续的奇数
            while (even < odd && nums[odd] % 2 != 0) {
                odd--;
            }
//            if (nums[even] % 2 != 0) {
//                int temp = nums[even];
//                nums[even] = nums[odd];
//                nums[odd] = temp;
//            }
            // 比上面的更好点
            // 这里一定even位置上是奇数，odd位置上是偶数
            // 交换两位置上的元素
            if (even < odd) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                // 并向中靠拢
                even++;
                odd--;
            }
        }
        // 原地修改，直接返回原数组即可
        return nums;
    }
}
