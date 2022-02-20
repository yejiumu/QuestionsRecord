package LeetCode;

/**
 * 换酒问题
 */
public class _1518_numWaterBottles {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：35.1 MB, 在所有 Java 提交中击败了65.63%的用户
     */
    public int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles < numExchange) {
            return numBottles;
        }
        int change = numBottles / numExchange;
        int lost = numBottles % numExchange;
        int sum = numBottles;
        while (change != 0) {
            sum += change;
            int num = change + lost;
            change = num / numExchange;
            lost = num % numExchange;
        }
        return sum;
    }
}
