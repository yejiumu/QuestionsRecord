package LeetCode;

/**
 * 计算力扣银行的钱
 */
public class _1716_totalMoney {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：35 MB, 在所有 Java 提交中击败了85.53%的用户
     */
    public int totalMoney(int n) {
        int weeks = n / 7;
        int lastWeek = 28 + 7 * (weeks - 1);
        int week = (28 + lastWeek) * weeks / 2;
        int days = n % 7;
        int day = (weeks + 1 + weeks + days) * days / 2;
        return week + day;
    }
}
