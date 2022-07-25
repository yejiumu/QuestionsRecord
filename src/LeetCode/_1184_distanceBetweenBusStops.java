package LeetCode;

/**
 * 公交站间的距离
 *
 * @author xoke
 * @date 2022/7/25
 */
public class _1184_distanceBetweenBusStops {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了13.42%的用户
     */
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        // 默认start是较小位置，不是则进行调换
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        int len = distance.length;
        // 一次遍历，直接计算两点之间距离和之外距离
        int between = 0, besides = 0;
        for (int i = 0; i < len; i++) {
            if (i >= start && i < destination) {
                between += distance[i];
            } else {
                besides += distance[i];
            }
        }
        // 返回两者较小值
        return Math.min(besides, between);
    }
}
