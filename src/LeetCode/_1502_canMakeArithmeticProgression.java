package LeetCode;

import java.util.Arrays;

/**
 * 判断能否形成等差数列
 */
public class _1502_canMakeArithmeticProgression {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.49%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了20.35%的用户
     * <p>
     * 注释掉的为本人代码，新代码更优秀
     */
    public boolean canMakeArithmeticProgression(int[] arr) {
        //首先一定要排序
        Arrays.sort(arr);
        //int interVal = arr[1] - arr[0];
        //在排序后的数组中遍历
        for (int i = 1; i < arr.length; i++) {
            //if (arr[i] - arr[i - 1] != interVal) {
            //等差数列的特性[a - b = b - c] => [a + c = 2 * b]
            if (arr[i + 1] + arr[i - 1] != 2 * arr[i]) {
                //一旦不符合条件，直接返回false
                return false;
            }
        }
        return true;
    }
}
