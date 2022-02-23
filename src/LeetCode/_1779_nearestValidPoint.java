package LeetCode;

/**
 * 找到最近的有相同 X 或 Y 坐标的点
 */
public class _1779_nearestValidPoint {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：48.6 MB, 在所有 Java 提交中击败了47.70%的用户
     */
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            //判断横坐标或者纵坐标是否符合要求
            if (points[i][0] == x || points[i][1] == y) {
                int newMin = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                //将min与newMin比较，若newMin小，则更新min和index
                if (min > newMin) {
                    min = newMin;
                    index = i;
                }
            }
        }
        //返回index，即符合条件的下标，若不符合条件，也会返回初始值(-1)
        return index;
    }
}
