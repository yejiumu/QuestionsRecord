package LeetCode;

/**
 * 平方数之和
 */
public class _633_judgeSquareSum {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了26.25%的用户
     * 内存消耗：38 MB, 在所有 Java 提交中击败了74.36%的用户
     */
//    public boolean judgeSquareSum(int c) {
//        for (long a = 0; a * a <= c; a++) {
//            double b = Math.sqrt(c - a * a);
//            if (b == (int) b) {
//                return true;
//            }
//        }
//        return false;
//    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了91.24%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了64.11%的用户
     */
    public boolean judgeSquareSum(int c) {
        long left = 0, right = (long) Math.sqrt(c);
        while (left <= right) {
            long temp = left * left + right * right;
            if (temp == c) {
                return true;
            } else if (temp > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
