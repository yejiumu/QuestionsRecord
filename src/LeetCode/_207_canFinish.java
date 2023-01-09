package LeetCode;

import java.util.*;

/**
 * 课程表
 *
 * @author xoke
 * @date 2023/1/9
 */
public class _207_canFinish {
    /**
     * 执行用时：13 ms, 在所有 Java 提交中击败了16.01%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了20.36%的用户
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 1.课号和对应的入度
        Map<Integer, Integer> inDegree = new HashMap<>();
        // 将所有的课程先放入
        for (int i = 0; i < numCourses; i++) {
            inDegree.put(i, 0);
        }
        // 2.依赖关系, 依赖当前课程的后序课程
        Map<Integer, List<Integer>> map = new HashMap<>();
        // 初始化入度和依赖关系
        for (int[] relation : prerequisites) {
            // (3,0), 想学3号课程要先完成0号课程, 更新3号课程的入度和0号课程的依赖(邻接表)
            int cur = relation[1];
            int next = relation[0];
            // 1.更新入度
            inDegree.put(next, inDegree.get(next) + 1);
            // 2.当前节点的邻接表
            if (!map.containsKey(cur)) {
                map.put(cur, new ArrayList<>());
            }
            map.get(cur).add(next);
        }
        // 3.BFS, 将入度为0的课程放入队列, 队列中的课程就是没有先修, 可以学的课程
        Queue<Integer> queue = new LinkedList<>();
        for (int key : inDegree.keySet()) {
            if (inDegree.get(key) == 0) {
                queue.offer(key);
            }
        }
        // 取出一个节点, 对应学习这门课程.
        // 遍历当前邻接表, 更新其入度; 更新之后查看入度, 如果为0, 加入到队列
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            // 遍历当前课程的邻接表, 更新后继节点的入度
            if (!map.containsKey(cur)) {
                continue;
            }
            List<Integer> list = map.get(cur);
            for (int course : list) {
                inDegree.put(course, inDegree.get(course) - 1);
                if (inDegree.get(course) == 0) {
                    queue.offer(course);
                }
            }
        }
        // 4.遍历入队, 如果还有课程的入度不为0, 返回false
        for (int key : inDegree.keySet()) {
            if (inDegree.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
