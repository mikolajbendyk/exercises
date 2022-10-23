package codility.lessons;

import java.util.Arrays;

public class TapeEquilibrium {

    public static void main(String[] args) {
        System.out.println(solution2(new int[]{3,1,2,4,3,6}));
    }

    // public static int solution(int[] A) {        // wrong (84%)
    //     int smallestDiff = Integer.MAX_VALUE;
    //     for (int i=1; i<A.length; i++) {
    //         int sum1 = Arrays.stream(Arrays.copyOfRange(A, 0, i)).sum();
    //         int sum2 = Arrays.stream(Arrays.copyOfRange(A, i, A.length)).sum();
    //         int diff = Math.abs(sum1 - sum2);
    //         smallestDiff = diff < smallestDiff ? diff : smallestDiff;
    //     }
    //     return smallestDiff;
    // }

    // public static int solution2(int[] A) {       // wrong (84%)
    //     int len = A.length;
    //     int smallestDiff = Integer.MAX_VALUE;
    //     int sum1 = A[0];
    //     int sum2 = Arrays.stream(Arrays.copyOfRange(A, 1, len)).sum();
    //     for (int i=1; i<len; i++) {
    //         int diff = Math.abs(sum1 - sum2);
    //         smallestDiff = diff < smallestDiff ? diff : smallestDiff;
    //         if (i + 1 < len) {
    //             sum1 += A[i];
    //             sum2 -= A[i];
    //         }
    //     }
    //     return smallestDiff;
    // }

    private static int solution(int[] A) {
        int totalSum = 0;
        for (int i : A) {
            totalSum += i;
        }
        int leftSum = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            int rightSum = totalSum - leftSum;
            int diff = Math.abs(leftSum - rightSum);
            if (diff < result) result = diff;
        }
        return result;
    }

    private static int solution2(int[] A) {
        int rightSum = 0;
        for (int i : A) rightSum += i;
        int leftSum = 0;

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            int diff = Math.abs(leftSum - rightSum);
            if (diff < minDiff) minDiff = diff;
        }

        return minDiff;
    }
}
