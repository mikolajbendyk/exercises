package codility.lessons.old;

import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,1,5,8,9,7,4,6,11,10}));
        System.out.println(solution(new int[]{2}));
        System.out.println(solution(new int[]{}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i=1; i<A.length+1; i++) {
            if (i != A[i-1]) {
                return i;
            }
        }
        return A.length+1;
    }
}
