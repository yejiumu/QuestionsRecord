package LeetCode.WeekMatch.the_300;

public class C {
    static int sum = 1;
    static int mod = 1000000007;

    public static void main(String[] args) {
        System.out.println(peopleAwareOfSecret(6, 2, 4));
    }

    public static int peopleAwareOfSecret(int n, int delay, int forget) {
        if (n <= delay) {
            return 0;
        }
        int temp1 = delay;
        int temp2 = forget;
        n -= 1;
        while (forget-- > 0 && n > 0) {
            delay--;
            if (delay < 0) {
                sum = (sum + peopleAwareOfSecret(n, temp1, temp2)) % mod;
            }
        }
        if (forget == 0) {
            sum -= 1;
        }
        return sum;
    }
}
