package LeetCode;

import java.util.Arrays;

/**
 * 颜色分类
 */
public class _75_sortColors {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了40.99%的用户
     */
    public void sortColors(int[] nums) {
        // 标记三个数的个数，并且进行反复覆盖
        int num0 = 0, num1 = 0, num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[num2++] = 2;
                nums[num1++] = 1;
                nums[num0++] = 0;
            } else if (nums[i] == 1) {
                nums[num2++] = 2;
                nums[num1++] = 1;
            } else {
                nums[num2++] = 2;
            }
        }
    }

}
