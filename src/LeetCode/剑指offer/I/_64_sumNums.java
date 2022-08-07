package LeetCode.剑指offer.I;

/**
 * 求1+2+…+n
 *
 * @author xoke
 * @date 2022/8/7
 */
public class _64_sumNums {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了55.86%的用户
     */
    public int sumNums(int n) {
        // 此处的boolean变量就是为了终止递归
        // 当n == 0时，结果为false，不再执行&&后面的代码
        // 然后在一层一层的返回n进行累加求和
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
