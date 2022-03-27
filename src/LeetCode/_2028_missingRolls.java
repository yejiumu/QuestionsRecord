package LeetCode;

import java.util.Arrays;

/**
 * 找出缺失的观测数据
 */
public class _2028_missingRolls {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：59.3 MB, 在所有 Java 提交中击败了9.01%的用户
     */
    public int[] missingRolls(int[] rolls, int mean, int n) {
        // 先算出丢失的总和
        int len = rolls.length;
        int missSum = mean * (len + n);
        for (int num : rolls) {
            missSum -= num;
        }
        // 判断丢失总和是否大于6与丢失总数的乘积，或小于丢失总数(与1的乘积)
        if (missSum > n * 6 || missSum < n) {
            // 如果是，直接返回空数组
            return new int[0];
        }
        // 创建丢失总和的平均值(取整)，以及记录下余数
        int avgN = missSum / n, index = missSum % n;
        int[] miss = new int[n];
        for (int i = 0; i < n; i++) {
            // 将每个赋值为平均值，并将前index个加一
            miss[i] = avgN + (i < index ? 1 : 0);
        }
        return miss;
    }
}
