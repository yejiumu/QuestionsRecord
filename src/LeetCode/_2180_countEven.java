package LeetCode;

/**
 * 统计各位数字之和为偶数的整数个数
 *
 * @author xoke
 * @date 2023/1/6
 */
public class _2180_countEven {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了83.26%的用户
     * 内存消耗：38.3 MB, 在所有 Java 提交中击败了53.98%的用户
     */
    public int countEven(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            int sum = 0, x = i;
            while (x != 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}
