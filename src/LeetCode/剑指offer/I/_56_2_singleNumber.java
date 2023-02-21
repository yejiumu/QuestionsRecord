package LeetCode.剑指offer.I;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中数字出现的次数 II
 *
 * @author xoke
 * @date 2022/8/22
 */
public class _56_2_singleNumber {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了85.08%的用户
     * 内存消耗：42.9 MB, 在所有 Java 提交中击败了26.69%的用户
     */
    public int singleNumber(int[] nums) {
        // 创建一个32位的数组
        int[] binary = new int[32];
        for (int num : nums) {
            for (int j = 0; j < 32; j++) {
                // 将每个数字的二进制中的数进行相加
                binary[j] += num & 1;
                // 不要用num>>j，每次调用都要移动j位，耗费时间，相当于是O(n^2)
                // 直接将num无符号右移赋值即可
                num >>>= 1;
            }
        }
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            ans <<= 1;
            // 如果该二进制位的和是3的倍数
            // 只出现过一次的数中该位置的二进制一定为0
            // 否则都出现过3次
            if (binary[i] % 3 == 1) {
                // 二进制加一
                ans = ans | 1;
            }
        }
        return ans;
    }

    public int singleNumber1(int[] nums) {
        // hashmap统计次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
}
