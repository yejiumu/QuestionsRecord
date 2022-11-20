package LeetCode;

/**
 * @author xoke
 * @date 2022/11/20
 */
public class _799_champagneTower {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.6 MB, 在所有 Java 提交中击败了92.43%的用户
     */
    public double champagneTower(int poured, int query_row, int query_glass) {
        // 先将全部倒入一个酒杯里
        double[] row = {poured};
        for (int i = 1; i <= query_row; i++) {
            // 然后计算下一层的酒杯
            double[] nextRow = new double[i + 1];
            for (int j = 0; j < i; j++) {
                // 遍历每一个酒杯
                double volume = row[j];
                if (volume > 1) {
                    // 如果已经超过1，则会溢出，所以该酒杯的下面两个酒杯会将该酒杯的溢出部分平分
                    nextRow[j] += (volume - 1) / 2;
                    nextRow[j + 1] += (volume - 1) / 2;
                }
            }
            // 然后就当前酒杯层进行替换即可
            row = nextRow;
        }
        return Math.min(1, row[query_glass]);
    }
}
