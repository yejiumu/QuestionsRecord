package LeetCode;

/**
 * 分发糖果
 *
 * @author xoke
 * @date 2022/11/25
 */
public class _135_candy {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了98.58%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了27.68%的用户
     */
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] candy = new int[len];
        candy[0] = 1;
        for (int i = 1; i < len; i++) {
            candy[i] = ratings[i] > ratings[i - 1] ? candy[i - 1] + 1 : 1;
        }
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }
        int res = 0;
        for (int num : candy) {
            res += num;
        }
        return res;
    }
}
