package LeetCode;

/**
 * 各位相加
 */
public class _258_addDigits {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了33.95%的用户
     */
//    public int addDigits(int num) {
//        while (num / 10 != 0) {
//            num = add(num);
//        }
//        return num;
//    }
//    public int add(int num) {
//        int res = 0;
//        while (num != 0) {
//            res += num % 10;
//            num /= 10;
//        }
//        return res;
//    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.5 MB, 在所有 Java 提交中击败了30.05%的用户
     *
     * 简单循环，加上该数的取余后除10
     */
    public int addDigits(int num) {
        //判断是否为一位数
        while (num >= 10) {
            int res = 0;
            //当num不为零时，继续循环
            while (num != 0) {
                //累加num的个位数
                res += num % 10;
                //将十位数变为个位数
                num /= 10;
            }
            //将res赋值给num，继续大循环
            num = res;
        }
        //当num符合条件，退出循环，直接返回
        return num;
    }
}
