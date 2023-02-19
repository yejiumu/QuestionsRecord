package LeetCode.WeekMatch.the_333;

/**
 * @author jiumu
 * @date 2023/2/19
 */
public class B {
    public static void main(String[] args) {
        minOperations(39);
    }

    static int count = 0;

    public static int minOperations(int n) {
        if (n == 0) {
            return 0;
        }
        int x = 0x10000000;
        loop(n, x);
        return count;
    }

    public static void loop(int n, int x) {
        if (n == 0) {
            return;
        }
        if (n < 0) {
            n = -n;
        }
        int tmp;
        while (true) {
            if (n >= x) {
                tmp = (n - x) < (x * 2 - n) ? x : x * 2;
                count++;
                loop(tmp - n, x);
                break;
            }
            x >>= 1;
        }
    }
}

//        while (n != 0) {
//            if (n >= x) {
//                n -= x;
//                count++;
//            }
//            x >>= 1;
//        }