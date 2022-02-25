package LeetCode;

/**
 * 缀点成线
 */
public class _1232_checkStraightLine {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.7 MB, 在所有 Java 提交中击败了51.01%的用户
     */
    public boolean checkStraightLine(int[][] coordinates) {
        //由斜率公式得：(x0 - x1)/(y0 - y1) == (x0 - xi)/(y0 - yi)
        //防止除0，变换成相乘的形式：(x0 - x1)*(y0 - yi) == (x0 - xi)*(y0 - y1)
        for (int[] coordinate : coordinates) {
            if ((coordinates[1][1] - coordinates[0][1]) * (coordinate[0] - coordinates[0][0])
                    != (coordinate[1] - coordinates[0][1]) * (coordinates[1][0] - coordinates[0][0])) {
                return false;
            }
        }
        return true;
    }
}
