package codility.lessons;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
                if (i == A.length-1) {  //to w sumie mogłoby być nizej zamiast return 0, bo w tresci zad info ze tablica    zawsze bedzie miala jeden element bez powtorzen
                    return A[i];
                }
                comp = A[i];
            }
        }
        return 0;
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




    private static int solution2(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            Integer val = map.get(A[i]);
            if (val == null || val == 2) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], 2);
            }
        }

        return map.keySet().stream().filter(k -> map.get(k) == 1).findFirst().orElse(0);
    }


    // for (int i = 0; i < A.length; i++) {
//     Integer val = map.get(A[i]);
//     if (val == null) {
//         map.put(A[i], 1);
//     } else {
//         if (val == 1) {
//             map.put(A[i], 2);
//         } else {
//             map.remove(A[i]);
//         }
//     }
// }


    private static int solutionJavaStart(int[] A) {
        Set<Integer> ints = new HashSet<>();
        
        for (int i : A) {
            if (ints.contains(i)) {
                ints.remove(i);
            } else {
                ints.add(i);
            }
        }

        for (int i : ints) {
            return i;
        }

        return 0;
    }
}
