package LeetCode;

public class _9_isPalindrome {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了71.71的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了8.48%的用户
     */
//    public boolean isPalindrome(int x) {
//        if (x < 0 || (x % 10 == 0 && x != 0)) {
//            return false;
//        }
//        char[] arr = Integer.toString(x).toCharArray();
//        int len = arr.length;
//        for (int i = 0; i < len / 2; i++) {
//            if (arr[i] != arr[len - i - 1]) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int halfNum = 0;
        while (x > halfNum) {
            halfNum = halfNum * 10 + x % 10;
            x /= 10;
        }
        // 当数字长度为奇数时，我们可以通过 revertedNumber / 10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == halfNum || x == halfNum / 10;
    }
}
