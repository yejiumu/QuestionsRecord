package LeetCode;

import java.util.Arrays;

/**
 * 多数元素
 */
public class _169_majorityElement {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了33.61%的用户
     * 内存消耗：44.5 MB, 在所有 Java 提交中击败了92.27%的用户
     * <p>
     * 想复杂了
     */
//    public int majorityElement(int[] nums) {
//        int len = nums.length;
//        if (len == 1) {
//            return nums[0];
//        }
//        Arrays.sort(nums);
//        int ans = 1;
//        for (int i = 0; i < len; i++) {
//            if (nums[i] == nums[i + 1]) {
//                ans++;
//            } else {
//                ans = 1;
//            }
//            if (ans > len / 2) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }

    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了58.95%的用户
     * 内存消耗：44.7 MB, 在所有 Java 提交中击败了71.96%的用户
     * <p>
     * 可是时间复杂度是NlogN，空间复杂度也要logN，因为自带排序就是这样
     */
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
//    }

    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了58.95%的用户
     * 内存消耗：44.6 MB, 在所有 Java 提交中击败了86.83%的用户
     *
     * 利用过半的特点，两个两个不相同就相互抵消，剩下的一定是那个数
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
