package LeetCode;

/**
 * 找到小镇的法官
 */
public class _997_findJudge {
    //有点小问题T_T
//    public int findJudge(int n, int[][] trust) {
//        if (trust == null || trust.length == 0 || (trust.length == 1 && trust[0].length
//                == 0)) {
//            return -1;
//        }
//        int[] arr = new int[trust.length + 1];
//        for (int i = 0; i < trust.length; i++) {
//            arr[trust[i][1] - 1]++;
//        }
//        int max = arr[0], index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                index = i;
//            }
//        }
//        for (int i = 0; i < trust.length; i++) {
//            if (trust[i][0] == index + 1) {
//                return -1;
//            }
//        }
//        return index + 1;
//    }

    /**
     * 感觉我的就是这样，可惜没想到
     */
    public int findJudge(int N, int[][] trust) {
        int[][] people = new int[N][2];
        for (int[] person : trust) {
            int out = person[0];
            int in = person[1];
            people[out - 1][0]++;
            people[in - 1][1]++;
        }
        for (int i = 0; i < N; i++) {
            if (people[i][0] == 0 && people[i][1] == N - 1)
                return i + 1;
        }
        return -1;
    }
}
