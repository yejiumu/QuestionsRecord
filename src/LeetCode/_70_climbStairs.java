package LeetCode;

/**
 * 爬楼梯
 */
public class _70_climbStairs {
    /**
     * 挂了，尽量少用递归，TimeOut
     */
//    public int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        } else if (n == 2) {
//            return 2;
//        } else {
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        }
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：37.9 MB, 在所有 Java 提交中击败了46.86%的用户
     * <p>
     * 没必要用递归，迭代计算即可
     */
    public int climbStairs(int n) {
        //创建三个变量，进行计算间的运算
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            //类似于斐波那契数列的求法
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
