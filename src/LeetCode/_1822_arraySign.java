package LeetCode;

/**
 * 数组元素积的符号
 */
public class _1822_arraySign {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.7 MB, 在所有 Java 提交中击败了44.06%的用户
     * <p>
     * 该题最好不要使用直接相乘，最后得到的数值太大，
     * 可以使用boolean直接进行判断或用某个数值 * (-1)
     */
    public static int arraySign(int[] nums) {
        //先默认积为正数
        boolean res = true;
        //遍历每一个数
        for (int num : nums) {
            //如果有一个是0，则直接返回0
            if (num == 0) {
                return 0;
            }
            //如果为负数，则对res取反
            if (num < 0) {
                res = !res;//这样不用一个一个乘
            }
        }
        return res ? 1 : -1;
    }
}
