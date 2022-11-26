package LeetCode.CodeCarl.greedy;

/**
 * 柠檬水找零
 *
 * @author xoke
 * @date 2022/11/26
 */
public class _860_lemonadeChange {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了63.53%的用户
     * 内存消耗：53 MB, 在所有 Java 提交中击败了16.52%的用户
     */
    public boolean lemonadeChange(int[] bills) {
        // 统计拥有的5和10的数量即可
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                five--;
                ten++;
            } else if (bill == 20) {
                // 如果是20，优先把10的找出，因为5更加通用
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    five -= 3;
                }
            }
            if (five < 0 || ten < 0) {
                return false;
            }
        }
        return true;
    }
}
