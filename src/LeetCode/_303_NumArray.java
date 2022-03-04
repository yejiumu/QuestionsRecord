package LeetCode;

import java.util.Arrays;

/**
 * 区域和检索 - 数组不可变
 */
public class _303_NumArray {
    /**
     * 执行用时：50 ms, 在所有 Java 提交中击败了20.84%的用户
     * 内存消耗：44.2 MB, 在所有 Java 提交中击败了16.81%的用户
     * <p>
     * 这个类只有一个方法，所以肯定是一直调这个方法，所以这个方法复杂度不可以太高，构造器可以高点，
     * 因为只初始化一次
     */
//    class NumArray {
//        private int[] arr;
//        public NumArray(int[] nums) {
//            arr = Arrays.copyOf(nums, nums.length);
//        }
//        public int sumRange(int left, int right) {
//            int res = 0;
//            for (int i = left; i <= right; i++) {
//                res += arr[i];
//            }
//            return res;
//        }
//    }

    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：43.8 MB, 在所有 Java 提交中击败了36.66%的用户
     */
    class NumArray {
        //创建数组属性
        private final int[] res;

        public NumArray(int[] nums) {
            int len = nums.length;
            res = new int[len + 1];
            for (int i = 0; i < len; i++) {
                //因为这个类是肯定不会调用自己的数组的，所以数组里存什么就以方法方便为主
                //直接存前N项和(前缀和)
                res[i + 1] = res[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            //由上述，直接[right + 1] - [left]
            return res[right + 1] - res[left];
        }
    }
}
