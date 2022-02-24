package LeetCode;

/**
 * 快乐数
 */
public class _202_isHappy {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了83.01%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了16.69%的用户
     */
    public boolean isHappy(int n) {
        //这里循环100次，如果100次还是得不到结果就认为他不是快乐数
        for (int i = 0; i < 100; i++) {
            int sum = 0;
            while (n > 0) {
                //sum加上n的最后一位的平方，然后n / 10，直到n <= 0
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (sum == 1) {
                //如果得出结果，直接返回true
                return true;
            } else {
                //没有得出结果。继续循环
                n = sum;
            }
        }
        //100次循环还没有得出结果，默认为不是快乐数
        return false;
    }
}
