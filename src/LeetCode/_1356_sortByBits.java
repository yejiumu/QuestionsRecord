package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 根据数字二进制下 1 的数目排序
 */
public class _1356_sortByBits {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了29.01%的用户
     * <p>
     * 🐮，官解都没这个妙
     */
    public int[] sortByBits(int[] arr) {
        //常规定义
        int len = arr.length;
        int[] res = new int[len];
        //遍历
        for (int i = 0; i < len; i++) {
            //使用bitCount求数值中1的个数，并乘100000(题目中0 <= arr[i] <= 10^4)
            //然后加上原数字
            res[i] = Integer.bitCount(arr[i]) * 100000 + arr[i];
        }
        //排序
        Arrays.sort(res);
        for (int i = 0; i < len; i++) {
            //对100000取余
            res[i] = res[i] % 100000;
        }
        return res;
    }
}
