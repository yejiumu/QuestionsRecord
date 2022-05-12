package LeetCode;

/**
 * 统计位数为偶数的数字
 */
public class _1295_findNumbers {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了93.79%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了21.47%的用户
     */
    /*
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
//            int cnt = 0;
//            while (num != 0) {
//                num /= 10;
//                cnt++;
//            }
//            if (cnt % 2 == 0) {
//                ans++;
//            }
            // 使用内置函数，着实是没想到🤔
            if (Integer.toString(num).length() % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
     */

    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了93.79%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了12.92%的用户
     */
    public int findNumbers(int[] nums) {
        int ans = 0;
        // 数学方法，直接log10得出结果
        for (int num : nums) {
            if (((int) Math.log10(num) + 1) % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
