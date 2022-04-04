package LeetCode;

public class _374_guessNumber {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：37.9 MB, 在所有 Java 提交中击败了68.49%的用户
     */
    public int guessNumber(int n) {
        // 创建左右两指针
        int left = 1, right = n;
        // 判断循环条件
        while (left < right) {
            // 防止两个数太大相加超出范围
            int mid = left + (right - left) / 2;
            // 设置边界转换条件
            if (guess(mid) <= 0) {
                // 答案在区间 [left, mid] 中
                right = mid;
            } else {
                // 答案在区间 [mid + 1, right] 中
                left = mid + 1;
            }
        }
        // 此时left == right，区间为一个点，即为答案
        return left;
    }

    public int guess(int num) {
        if (num > 1) {
            return 1;
        } else if (num < 1) {
            return -1;
        } else {
            return 0;
        }
    }
}
