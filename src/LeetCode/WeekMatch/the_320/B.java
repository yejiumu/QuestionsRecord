package LeetCode.WeekMatch.the_320;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xoke
 * @date 2022/11/20
 */
public class B {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> total = new ArrayList<>();

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        travel(root);
        for (Integer query : queries) {
            List<Integer> temp = new ArrayList<>();
            temp.add(uperK(query));
            temp.add(downK(query));
            list.add(new ArrayList<>(temp));
        }
        return list;
    }

    public void travel(TreeNode root) {
        if (root == null) {
            return;
        }
        travel(root.left);
        total.add(root.val);
        travel(root.right);
    }

    //获取值<=k的最大值
    public int uperK(int k) {
        int l = 0, r = total.size() - 1;
        //标注1： 这里是l<r，
        while (l < r) {
            //标注2： 这样的操作是为了取高位
            int mid = (l + r + 1) / 2;
            if (total.get(mid) <= k) { //标注3：因为a[mid]<=k,所以a[mid]可能=k，所以mid坐标也满足条件，l = mid而不是mid+1;
                l = mid;
            } else {
                r = mid - 1; //这是a[mid] > k的时候。
            }
        }
        //标注4： 因为此时求得到的是最接近于目标值k的数，
        // 如果最小值都大于k的话，那么就没有办法得到了，所以就进行一个判断
        if (total.get(l) > k) return -1;
        //标注5： 其实这里无论返回 a[l] 还是a[r]都行，循环的退出时间是l == r 的时候
        return total.get(l);
    }


    public int downK(int key) {
        int low = 0, high = total.size() - 1;
        while (low < high) {
            //这里进行的是取低位， 也是为了使得循环可以正确退出，防止死循环
            int mid = (low + high) / 2;
            if (total.get(mid) < key) {
                low = mid + 1;
            } else { //a[mid] >= key
                high = mid;   //因为mid也满足情况
            }
        }
        //这里进行检查的原因参考上面的标注
        if (total.get(high) >= key) {
            return high;
        } else {
            return -1;
        }
    }

}