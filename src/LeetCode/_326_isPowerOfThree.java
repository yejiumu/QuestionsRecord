package LeetCode;

/**
 * 3 的幂
 */
public class _326_isPowerOfThree {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了40.32%的用户
     *
     * 直接使用3在int类型内的最大幂来进行约数计算，3^19 (1162261467)
     */
//    public boolean isPowerOfThree(int n) {
//        return n > 0 && 1162261467 % n == 0;
//    }

    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了20.48%的用户
     */
    public boolean isPowerOfThree_(int n) {
        //如果当前n不为零且为3的倍数，进入循环
        while (n != 0 && n % 3 == 0) {
            //除以3
            n /= 3;
        }
        //判断此时n是否为1
        return n == 1;
    }

    /**
     * 执行用时：8 ms, 在所有 Java 提交中击败了79.81%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了25.82%的用户
     * <p>
     * 从2的幂过来的，模板直接套
     */
    public boolean isPowerOfThree(int n) {
        // n为负，直接判错
        if (n <= 0) {
            return false;
        }
        // long为了防止越界
        // ans从1一直乘2，与n进行对比
        long ans = 1;
        while (true) {
            if (ans == n) {
                return true;
            } else if (ans > n) {
                return false;
            }
            ans *= 3;
        }
    }
}
