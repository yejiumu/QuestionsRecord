package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class _973_kClosest {
    /**
     * 执行用时：21 ms, 在所有 Java 提交中击败了86.11%的用户
     * 内存消耗：49.2 MB, 在所有 Java 提交中击败了83.07%的用户
     */
    public int[][] kClosest(int[][] points, int k) {
        // 重写sort方法，比较标准为两坐标到原点距离的差(从小到大)
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]);
            }
        });
        // 返回排序后数组的前k个
        return Arrays.copyOfRange(points, 0, k);
    }
}
