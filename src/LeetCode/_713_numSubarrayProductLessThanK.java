package LeetCode;

/**
 * 乘积小于 K 的子数组
 */
public class _713_numSubarrayProductLessThanK {
    /**
     * 执行用时：857 ms, 在所有 Java 提交中击败了17.70%的用户
     * 内存消耗：48.2 MB, 在所有 Java 提交中击败了10.91%的用户
     * <p>
     * 凡事先暴力一下
     */
//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//        int len = nums.length;
//        int ans = 0;
//        for (int i = 0; i < len; i++) {
//            int temp = 1;
//            for (int j = i; j < len; j++) {
//                temp *= nums[j];
//                if (temp >= k) {
//                    break;
//                }
//                ans++;
//            }
//        }
//        return ans;
//    }

    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了99.95%的用户
     * 内存消耗：48 MB, 在所有 Java 提交中击败了31.58%的用户
     * <p>
     * 求连续子树组的个数，“连续子树组”很强的暗示———使用滑动窗口
     */
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        // product不可能超过int范围
        int product = 1, left = 0;
        int ans = 0;
        // 双指针，记录以每个数字为右边界时所形成的有效子数组的个数
        for (int right = 0; right < len; right++) {
            product *= nums[right];
            // 当前位置不能超过右边界且乘积不能大于等于k
            while (left <= right && product >= k) {
                // 如果在范围内，乘积超过了K
                // 将left右移，并将乘积减小
                product /= nums[left];
                left++;
            }
            // 统计以right为边界的子数组个数
            ans += right - left + 1;
        }
        return ans;
    }
}
