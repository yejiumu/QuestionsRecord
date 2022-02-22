package LeetCode;

/**
 * 整数的各位积和之差
 */
public class _1281_subtractProductAndSum {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38 MB, 在所有 Java 提交中击败了48.67%的用户
     */
    public int subtractProductAndSum(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int mul = 1, sum = 0;
        for (int num : arr) {
            mul *= num - '0';
            sum += num - '0';
        }
        return mul - sum;
    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了45.08%的用户
     */
//    public int subtractProductAndSum(int n) {
//        int mul = 1, sum = 0;
//        while (n > 0) {
//            int digit = n % 10;
//            n /= 10;
//            sum += digit;
//            mul *= digit;
//        }
//        return mul - sum;
//    }
}
