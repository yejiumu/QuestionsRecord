package LeetCode.WeekMatch.the_303;

/**
 * @author xoke
 * @date 2022/7/24
 */
public class C {
    class FoodRatings {
        String[] foods;
        String[] cuisines;
        int[] ratings;
        int len;

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            this.foods = foods;
            this.cuisines = cuisines;
            this.ratings = ratings;
            this.len = foods.length;
        }

        public void changeRating(String food, int newRating) {
            for (int i = 0; i < len; i++) {
                if (foods[i].equals(food)) {
                    ratings[i] = newRating;
                    break;
                }
            }
        }

        public String highestRated(String cuisine) {
            int max = 0;
            int index = -1;
            for (int i = 0; i < len; i++) {
                if (cuisines[i].equals(cuisine)) {
                    if (ratings[i] == max) {
                        if (foods[i].compareTo(foods[index]) < 0) {
                            index = i;
                        }
                        break;
                    }
                    if (ratings[i] > max) {
                        index = i;
                        max = ratings[i];
                    }
                }
            }
            return foods[index];
        }
    }
}
