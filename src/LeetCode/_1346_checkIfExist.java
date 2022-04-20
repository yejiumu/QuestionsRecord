package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 检查整数及其两倍数是否存在
 */
public class _1346_checkIfExist {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.98%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了50.01%的用户
     */
    public boolean checkIfExist(int[] arr) {
        // 直接使用set集合的特性
        Set<Integer> set = new HashSet<>();
        // 只考虑该数的是否有2倍或者1/2倍在集合中，不用考虑该数本身
        for (int num : arr) {
            // 如果有相同的，直接返回true
            if (set.contains(num)) {
                return true;
            }
            if (num % 2 == 0) {
                // 如果可以整除2，将该数除以2后添加进集合中
                set.add(num / 2);
            }
            // 并且再添加该数的2倍
            set.add(num * 2);
        }
        // 没有找到，返回false
        return false;
    }
}
