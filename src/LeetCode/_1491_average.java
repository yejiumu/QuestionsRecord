package LeetCode;

import java.util.Arrays;

/**
 * 去掉最低工资和最高工资后的工资平均值
 */
public class _1491_average {
    /*
     * 执行用时：2 ms, 在所有 Java 提交中击败了12.98%的用户
     * 内存消耗：39.2 MB, 在所有 Java 提交中击败了12.49%的用户
     */
//    public double average(int[] salary) {
//        int min = Arrays.stream(salary).min().getAsInt();
//        int max = Arrays.stream(salary).max().getAsInt();
//        int sum = Arrays.stream(salary).sum();
//        return 1.0 * (sum - min - max) / (salary.length - 2);
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了67.99%的用户
     */
    public double average(int[] salary) {
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double sum = 0;
        for (int j : salary) {
            min = Math.min(min, j);
            max = Math.max(max, j);
            sum += j;
        }
        return (sum - min - max) / (salary.length - 2);
    }
}
