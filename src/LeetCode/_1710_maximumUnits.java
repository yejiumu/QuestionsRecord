package LeetCode;

import java.util.Arrays;

/**
 * 卡车上的最大单元数
 *
 * @author xoke
 * @date 2022/11/15
 */
public class _1710_maximumUnits {
    /**
     * 执行用时：8 ms, 在所有 Java 提交中击败了69.29%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了72.18%的用户
     */
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> (b[1] - a[1]));
        int len = Math.min(boxTypes.length, truckSize);
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (truckSize >= boxTypes[i][0]) {
                res += boxTypes[i][1] * boxTypes[i][0];
                truckSize -= boxTypes[i][0];
            } else {
                res += boxTypes[i][1] * truckSize;
                break;
            }
        }
        return res;
    }
}
