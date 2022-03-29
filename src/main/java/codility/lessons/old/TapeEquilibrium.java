package codility.lessons.old;

import java.util.Arrays;

public class TapeEquilibrium {

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{3,1,2,4,3,6}));
    }

    public static int solution(int[] A) {
        int smallestDiff = Integer.MAX_VALUE;
        for (int i=1; i<A.length; i++) {
            int sum1 = Arrays.stream(Arrays.copyOfRange(A, 0, i)).sum();
            int sum2 = Arrays.stream(Arrays.copyOfRange(A, i, A.length)).sum();
            int diff = Math.abs(sum1 - sum2);
            smallestDiff = diff < smallestDiff ? diff : smallestDiff;
        }
        return smallestDiff;
    }

    public static int solution2(int[] A) {
        int len = A.length;
        int smallestDiff = Integer.MAX_VALUE;
        int sum1 = A[0];
        int sum2 = Arrays.stream(Arrays.copyOfRange(A, 1, len)).sum();
        for (int i=1; i<len; i++) {
            int diff = Math.abs(sum1 - sum2);
            smallestDiff = diff < smallestDiff ? diff : smallestDiff;
            if (i + 1 < len) {
                sum1 += A[i];
                sum2 -= A[i];
            }
        }
        return smallestDiff;
    }
}
