package LeetCode.WeekMatch.the_319;

/**
 * 最小公倍数为 K 的子数组数目
 *
 * @author xoke
 * @date 2022/11/13
 */
public class B {
    public int subarrayLCM(int[] nums, int k) {
        int len = nums.length, res = 0;
        for (int i = 0; i < len; i++) {
            int temp = nums[i];
            if (nums[i] == k) {
                ++res;
            }
            for (int j = i + 1; j < len; j++) {
                int lcm = lcm(temp, nums[j]);
                if (lcm == k) {
                    ++res;
                } else if (lcm > k) {
                    break;
                }
                temp = lcm;
            }
        }
        return res;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
