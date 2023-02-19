package LeetCode.WeekMatch.the_333;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiumu
 * @date 2023/2/19
 */
public class A {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int first = 0, second = 0;
        int len1 = nums1.length, len2 = nums2.length;
        while (first < len1 && second < len2) {
            if (nums1[first][0] > nums2[second][0]) {
                list.add(new int[]{nums2[second][0], nums2[second][1]});
                second++;
            } else if (nums1[first][0] < nums2[second][0]) {
                list.add(new int[]{nums1[first][0], nums1[first][1]});
                first++;
            } else {
                list.add(new int[]{nums1[first][0], nums1[first][1] + nums2[second][1]});
                first++;
                second++;
            }
        }
        if (first == len1) {
            while (second < len2) {
                list.add(new int[]{nums2[second][0], nums2[second][1]});
                second++;
            }
        } else {
            while (first < len1) {
                list.add(new int[]{nums1[first][0], nums1[first][1]});
                first++;
            }
        }
        int len = list.size();
        int[][] res = new int[len][2];
        for (int i = 0; i < len; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
