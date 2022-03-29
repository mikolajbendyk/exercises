package codility.lessons.old;

import java.util.Arrays;

public class DemoTask {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int n = 1;
        for (int i : A) {
            n = (i == n) ? n+1 : n;
        }
        return n;
    }
}
