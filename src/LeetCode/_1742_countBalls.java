package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 盒子中小球的最大数量
 *
 * @author xoke
 * @date 2022/11/23
 */
public class _1742_countBalls {
    /**
     * 执行用时：31 ms, 在所有 Java 提交中击败了32.28%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了40.95%的用户
     */
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            // 求出数字的每位的和
            int sum = sumOfBit(i);
            // 加入哈希表
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        // 遍历哈希表的值，寻找最大值
        int max = 0;
        for (int num : map.values()) {
            max = Math.max(num, max);
        }
        return max;
    }

    // 求位数之和
    public int sumOfBit(int value) {
        int sum = 0;
        // 当该数不为0，才进入循环
        while (value != 0) {
            // 每次循环对该数余10结果累加
            sum += value % 10;
            // 然后将该数除以10
            value /= 10;
        }
        return sum;
    }
}
