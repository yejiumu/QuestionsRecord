package LeetCode;

/**
 * 所有奇数长度子数组的和
 */
public class _1588_sumOddLengthSubArrays {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了40.59%的用户
     * 内存消耗：39 MB, 在所有 Java 提交中击败了33.17%的用户
     *
     * 这是复杂度最高的做法，三重循环，O(n^3)，也很好想，就不写注释了
     */
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j += 2) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
            }
            res += sum;
        }
        return res;
    }
}
