package LeetCode;

import java.util.Arrays;

/**
 * 最富有客户的资产总量
 */
public class _1672_maximumWealth {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了6.33%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了20.86%的用户
     *
     * 这种方法看似和简便，实则很浪费时间和空间，因为调用了太多方法
     */
//    public int maximumWealth(int[][] accounts) {
//        int res = -1;
//        for (int[] account : accounts) {
//            res = Math.max(Arrays.stream(account).sum(), res);
//        }
//        return res;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.5 MB, 在所有 Java 提交中击败了40.24%的用户
     */
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i = 0; i < accounts[0].length; i++) {
                sum += account[i];
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
