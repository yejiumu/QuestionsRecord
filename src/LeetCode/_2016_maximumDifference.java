package LeetCode;

/**
 * 增量元素之间的最大差值
 */
public class _2016_maximumDifference {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了24.64%的用户
     * 内存消耗：40.6 MB, 在所有 Java 提交中击败了26.82%的用户
     * <p>
     * 这个方法太简单(想)了，也太复杂(复杂度)了，pass掉
     * 还是官方的解答妙
     */
//    public int maximumDifference(int[] nums) {
//        int res = -1;
//        for (int i = 0; i < nums.length; i++) {
//            int j = i + 1;
//            while (j <= nums.length - 1) {
//                if (nums[i] < nums[j]) {
//                    res = Math.max(nums[j] - nums[i], res);
//                }
//                j++;
//            }
//        }
//        return res;
//    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.5 MB, 在所有 Java 提交中击败了28.51%的用户
     */
    public int maximumDifference(int[] nums) {
        //设置一个预先的最小值(代表了0 -- i中的最小值)
        int res = -1, preMin = nums[0];
        //从1开始遍历
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > preMin) {
                //如果大于最小值，则计算差值并比较
                res = Math.max(res, nums[i] - preMin);
            } else {
                //如果小于最小值，则更新最小值
                preMin = nums[i];
            }
        }
        //返回最终结果
        return res;
    }
}
