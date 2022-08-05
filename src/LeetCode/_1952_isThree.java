package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 三除数
 *
 * @author xoke
 * @date 2022/8/5
 */
public class _1952_isThree {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了11.74%的用户
     */
    public boolean isThree_(int n) {
        // 直接将因子存入set集合中
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        // 最后判断即可，还是有点不够效率
        return set.size() == 3;
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了9.52%的用户
     */
    public boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ++count;
                // 不能为同一个数
                if (i != n / i) {
                    ++count;
                }
                // 统计超过3，直接返回false
                if (count > 3) {
                    return false;
                }
            }
        }
        // 最后判断是否等于3
        return count == 3;
    }
}
