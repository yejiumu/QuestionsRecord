package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class _728_selfDividingNumbers {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.33%的用户
     * 内存消耗：38.8 MB, 在所有 Java 提交中击败了50.69%的用户
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                res.add(i);
            }
        }
        return res;
    }

    // 检查函数
    public boolean check(int n) {
        int m = n;
        while (n != 0) {
            // 将n与n的每个位数进行取余计算
            int temp = n % 10;
            // 如果该位数上为0，或取余结果不为0，直接返回false
            if (temp == 0 || m % temp != 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
