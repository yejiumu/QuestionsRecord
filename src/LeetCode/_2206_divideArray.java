package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 将数组划分成相等数对
 *
 * @author xoke
 * @date 2022/8/6
 */
public class _2206_divideArray {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.83%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了23.41%的用户
     */
    public boolean divideArray(int[] nums) {
        // 直接哈希
        int[] arr = new int[510];
        // 存入次数
        for (int num : nums) {
            arr[num]++;
        }
        for (int i = 0; i <= 500; i++) {
            // 如果有奇数次数的数字，直接返回false
            if (arr[i] % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}
