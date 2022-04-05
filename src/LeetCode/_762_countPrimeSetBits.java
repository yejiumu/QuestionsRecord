package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 二进制表示中质数个计算置位
 */
public class _762_countPrimeSetBits {
    /**
     * 执行用时：22 ms, 在所有 Java 提交中击败了28.10%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了68.37%的用户
     */
//    public int countPrimeSetBits(int left, int right) {
//        int res = 0;
//        // 创建列表，储存可能会出现的质数
//        List<Integer> list = new ArrayList<>
//                (Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31));
//        // 遍历范围内的所有数
//        for (int i = left; i <= right; i++) {
//            // 如果该数的二进制的1的个数在列表中存在，即为质数
//            if (list.contains(Integer.bitCount(i))) {
//                // 计数增加
//                res++;
//            }
//        }
//        return res;
//    }

    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了60.40%的用户
     */
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        // 遍历范围内的所有数
        for (int x = left; x <= right; ++x) {
            // 这一步怕是要好好看看
            // 范围内质数只有2,3,5,7,11,13,17,19
            // 所以用 mask = 665772 = 10100010100010101100
            // 二进制的从低到高的第 i 位为 1 表示 i 是质数，为 0 表示 i 不是质数。
            // 设整数 x 的二进制中 1 的个数为 c，若 mask &(按位与) 2^c 不为 0，则说明 c 是一个质数。
            if (((1 << Integer.bitCount(x)) & 665772) != 0) {
                ++ans;
            }
        }
        return ans;
    }
}
