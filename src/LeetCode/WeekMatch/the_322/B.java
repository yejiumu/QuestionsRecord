package LeetCode.WeekMatch.the_322;

import java.util.Arrays;

/**
 * @author xoke
 * @date 2022/12/4
 */
public class B {
    public long dividePlayers(int[] skill) {
        int sum = 0;
        long res = 0;
        for (int num : skill) {
            sum += num;
        }
        int len = skill.length, ava = sum * 2 / len;
        Arrays.sort(skill);
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            if (skill[i] + skill[j] != ava) {
                return -1;
            }
            res += (long) skill[i] * skill[j];
        }
        return res;
    }
}
