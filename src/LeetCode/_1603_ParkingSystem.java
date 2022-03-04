package LeetCode;

/**
 * 设计停车系统
 */
public class _1603_ParkingSystem {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了95.92%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了34.65%的用户
     *
     * 这个很简单，就不写思路了
     */
    class ParkingSystem {

        private int big;
        private int medium;
        private int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            switch (carType) {
                case 1:
                    if (big >= 0) {
                        big--;
                        return true;
                    } else {
                        return false;
                    }
                case 2:
                    if (medium > 0) {
                        medium--;
                        return true;
                    } else {
                        return false;
                    }
                case 3:
                    if (small > 0) {
                        small--;
                        return true;
                    } else {
                        return false;
                    }
            }
            return false;
        }
    }
}
