package codility.lessons.old;

import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,1,3,2}));
        System.out.println(solution(new int[]{4,1,3}));

    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int permNum = 1;

        for (int i : A) {
            if (permNum == i) {
                permNum++;
            } else {
                return 0;
            }
        }

        return 1;

    }
}
