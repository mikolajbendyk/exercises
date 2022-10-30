package codility.lessons;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution6(5, new int[]{3,4,4,6,1,4,4})));

    }

    private static int[] solution6(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        int Nplus = N + 1;
        int maxToUpd = 0;

        for (int i : A) {
            int index = i - 1;
            if (i >= 1 && i <= N) {
                if (counters[index] < maxToUpd) {
                    counters[index] = maxToUpd + 1;
                } else {
                    counters[index]++;
                }
                if (counters[index] > max) {
                    max = counters[index];
                }
            } else if (i == Nplus) {
                maxToUpd = max;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < maxToUpd) counters[i] = maxToUpd;
        }

        return counters;
    }

    // nie w pełni poprawne

    // public static int[] solution(int N, int[] A) {
    //     int[] counters = new int[N];
    //     Arrays.fill(counters, 0);
    //     for (int i=0; i<A.length; i++) {
    //         if (A[i] >= 1 && A[i] <= N) {
    //             counters[A[i]-1]++;
    //         } else if (A[i] == N + 1) {
    //             int max = 0;
    //             for (int c : counters) {
    //                 max = c > max ? c : max;
    //             }
    //             Arrays.fill(counters, max);
    //         }
    //     }
    //     return counters;
    // }

    // public static int[] solution2(int N, int[] A) {
    //     int[] counters = new int[N];
    //     Arrays.fill(counters, 0);
    //     for (int i : A) {
    //         if (i >= 1 && i <= N) {
    //             counters[i-1]++;
    //         } else if (i == N + 1) {
    //             int max = 0;
    //             for (int c : counters) {
    //                 max = c > max ? c : max;
    //             }
    //             Arrays.fill(counters, max);
    //         }
    //     }
    //     return counters;
    // }

    // public static int[] solution3(int N, int[] A) {
    //     int[] counters = new int[N];
    //     Arrays.fill(counters, 0);
    //     for (int i : A) {
    //         if (i >= 1 && i <= N) {
    //             counters[i-1]++;
    //         } else {
    //             int max = 0;
    //             for (int c : counters) {
    //                 max = c > max ? c : max;
    //             }
    //             Arrays.fill(counters, max);
    //         }
    //     }
    //     return counters;
    // }

    // public static int[] solution4(int N, int[] A) {
    //     int[] counters = new int[N];
    //     Arrays.fill(counters, 0);
    //     for (int i : A) {
    //         if (i >= 1 && i <= N) {
    //             counters[i-1]++;
    //         } else {
    //             int[] copy = Arrays.copyOf(counters, counters.length);
    //             Arrays.sort(copy);
    //             Arrays.fill(counters, copy[copy.length-1]);
    //         }
    //     }
    //     return counters;
    // }

    // private static int[] solution5(int N, int[] A) {
    //     int[] counters = new int[N];
    //     int max = 0;
    //     int Nplus = N + 1;
    //     boolean updToMax = true;

    //     for (int i : A) {
    //         if (i >= 1 && i <= N) {
    //             counters[i - 1]++;
    //             if (counters[i - 1] > max) {
    //                 max = counters[i - 1];
    //                 updToMax = false;
    //             }
    //         } else if (i == Nplus && !updToMax) {
    //             for (int j = 0; j < counters.length; j++) {
    //                 counters[j] = max;
    //             }
    //             updToMax = true;
    //         }
    //     }

    //     return counters;
    // }

    
}
