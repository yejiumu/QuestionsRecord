package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 两个数组的交集 II
 */
public class _350_intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int j : nums1) {
            list1.add(j);
        }
        //创建另一个列表，用于存储nums2与nums1中相同的元素
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (list1.contains(nums2[i])) {
                list2.add(nums2[i]);
                //将nums2[i]封装，remove(Object o)
                list1.remove(Integer.valueOf(nums2[i]));
            }
        }
        int[] ans = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            ans[i++] = num;
        }
        return ans;
    }
}
