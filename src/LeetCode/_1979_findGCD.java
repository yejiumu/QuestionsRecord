package LeetCode;

/**
 * 找出数组的最大公约数
 */
public class _1979_findGCD {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了27.32%的用户
     */
    public int findGCD(int[] nums) {
        // 数据范围小，直接定最大最小值
        int max = 0, min = 1001;
        for (int num : nums) {
            // 循环寻找最大最小值
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        // 返回两值的最大公约数
        return gcd(min, max);
    }

    // 最大公约数
    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
