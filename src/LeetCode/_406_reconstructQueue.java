package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 根据身高重建队列
 */
public class _406_reconstructQueue {
    /**
     * 执行用时：10 ms, 在所有 Java 提交中击败了23.10%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了59.41%的用户
     */
    public int[][] reconstructQueue(int[][] people) {
        // 高度从小到大，位置从大到小，先安排位置靠后的
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                }
                return o1[0] - o2[0];
            }
        });
        int len = people.length;
        // 创建原数组长度的二维数组，但不规定一维数组的长度
        int[][] arr = new int[len][];
        for (int[] person : people) {
            // 当前person就是剩下未安排的人中最矮的人
            // person[1]就代表他在剩余空位的索引值
            // 因为数组下标从0开始，所以位置要加1
            int spaces = person[1] + 1;
            for (int i = 0; i < len; i++) {
                if (arr[i] == null) {
                    // 如果当前位置没有安排，抵消一位
                    --spaces;
                    if (spaces == 0) {
                        // 如果此时位置数为0，则当前位置为目的位置
                        arr[i] = person;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
