package LeetCode;

public class _860_lemonadeChange {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：52.8 MB, 在所有 Java 提交中击败了18.33%的用户
     */
    public boolean lemonadeChange(int[] bills) {
        // 因为找零只有5、15两种情况，所以直接记录5、10的个数即可
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                // 20的情况，就是找一张10和一张5或者三张5
                if (five > 0 && ten > 0) {
                    // 优先一张10一张5，因为5用的最多，尽量少用点
                    five--;
                    ten--;
                } else if (five >= 3) {
                    // 如果没有10的了，就只能用5了
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
