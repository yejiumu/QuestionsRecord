package LeetCode;

import java.util.Arrays;

/**
 * 三角形的最大周长
 */
public class _976_largestPerimeter {
    /**
     * 执行用时：8 ms, 在所有 Java 提交中击败了99.74%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了9.12%的用户
     * <p>
     * 之所以是连续的三个数，是因为假设a < b < c < d,如果b,c,d不能构成三角形的话，即(b + c) < d,
     * (a + b)或者(a + c) 肯定也是小于d，显然也不能构成三角形。
     */
    public int largestPerimeter(int[] nums) {
        //先进行排序
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            //判断三边是否可以组成三角形[两边之和大于第三边]
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                //如果成立，直接返回，这一定是最大的
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        //如果没有找到，说明不能构成三角形，返回0
        return 0;
    }
}
