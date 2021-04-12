package codility.lessons;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
//        System.out.println(solution(new int[]{9,3,9,3,9,7,9,7,3}));
//        System.out.println(solution(new int[]{9,3,9,3,9,7,9}));
//        System.out.println(solution(new int[]{4,6,7,3,2,6,6,3,4,3,7,3,2}));
        System.out.println(solution(new int[]{4,4,4,4,5}));

    }

    public static int solution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        Arrays.sort(A);
        int comp = A[0];
        for (int i=1; i<A.length; i++) {
            if (comp != A[i]) {
                if (i % 2 != 0) {
                    return A[i-1];
                }
                if (i == A.length-1) {
                    return A[i];
                }
                comp = A[i];
            }
        }
        return 0;
    }
}


//    List<Integer> list = Arrays.stream(A)
//                .filter(n -> {
//                    int counter = 0;
//                    for (int i : A) {
//                        if (A[i] == n) {
//                            counter++;
//                        }
//                    }
//                    return counter % 2 == 0;
//                })
//                .collect(Collectors.toList());