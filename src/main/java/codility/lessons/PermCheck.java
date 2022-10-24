package codility.lessons;

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
            if (permNum == i) {     // WTF? xD
                permNum++;
            } else {
                return 0;
            }
        }

        return 1;

    }

    private static int solution2(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) return 0;
        }
        return 1;
    }

    private static int solution3(int[] A) {
        boolean[] check = new boolean[A.length];
        try {
            for (int i : A) {
                check[i - 1] = true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return 0;
        }
        for (boolean b : check) {
            if (!b) return 0;
        }
        return 1;
    }
}
