package LeetCode.WeekMatch.the_313;

/**
 * @author xoke
 * @date 2022/10/2
 */
public class C {
    public static void main(String[] args) {
        minimizeXor(25, 72);
    }

    public static int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2);
        int[] bits = new int[32];
        int ans = 0, index = 31;
        while (num1 != 0 && count != 0 && index >= 0) {
            if ((num1 & 1) == 1) {
                bits[index--] = 1;
                count--;
            } else {
                bits[index--] = 0;
            }
            num1 >>= 1;
        }
        index = 31;
        while (count != 0) {
            if (bits[index] == 0) {
                bits[index] = 1;
                count--;
            }
            index--;
        }
        for (int i = 31; i >= 0; i--) {
            if (bits[i] != 0) {
                ans += (int) Math.pow(2, 31 - i);
            }
        }
        return ans;
    }
}
