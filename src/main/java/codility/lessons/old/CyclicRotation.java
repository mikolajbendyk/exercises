package codility.lessons.old;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{}, 3)));
//        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 5)));
//        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 7)));
    }

    public static int[] solution(int[] A, int K) {
        if (A.length == 0 || A.length == 1) {
            return A;
        }

        int len = A.length;
        int rotations = K < len ? K : K % len;
        System.out.println(rotations);

        if (rotations == 0) {
            return A;
        }

        int[] result = new int[len];

//        for (int i=0; i<len; i++) {
//            if (i < len-rotations) {
//                result[i+rotations] = A[i];
//            } else {
//                result[i - (len - rotations)] = A[i];
//            }
//        }

        for (int i=0; i<len; i++) {
            if (i < len-rotations) {
                result[i+rotations] = A[i];
            } else {
                result[Math.abs(len - (i+rotations))] = A[i];
            }
        }

        return result;
    }
}
