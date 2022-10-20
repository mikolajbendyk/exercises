package codility.lessons;

import java.util.Arrays;

public class MissingInteger {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution(new int[]{-1, -3}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int missing = 1;

        for (int i : A) {
            missing = i == missing ? missing+1 : missing;
        }

        return missing;

    }
}
