package LeetCode;

import java.util.Arrays;

/**
 * 供暖器
 */
public class _475_findRadius {
    public int findRadius(int[] houses, int[] heaters) {
        // 先进行升序排列
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius = 0;
        int i = 0;
        for (int house : houses) {
            while (i < heaters.length && heaters[i] < house) {
                // 一直找到处于房屋右侧的热水器
                i++;
            }
            if (i == 0)
                radius = Math.max(radius, heaters[i] - house);
            else if (i == heaters.length)
                // 最后一个热水器
                return Math.max(radius, houses[houses.length - 1] - heaters[heaters.length - 1]);
            else
                // 房屋右侧的热水器和房屋左侧的热水器，取小的那个
                radius = Math.max(radius, Math.min(heaters[i] - house, house - heaters[i - 1]));
        }
        return radius;
    }
}
