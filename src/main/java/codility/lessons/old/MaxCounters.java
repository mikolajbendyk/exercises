package codility.lessons.old;

import java.util.Arrays;

public class MaxCounters {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution4(5, new int[]{3,4,4,6,1,4,4})));

    }

    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);
        for (int i=0; i<A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                counters[A[i]-1]++;
            } else if (A[i] == N + 1) {
                int max = 0;
                for (int c : counters) {
                    max = c > max ? c : max;
                }
                Arrays.fill(counters, max);
            }
        }
        return counters;
    }

    public static int[] solution2(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);
        for (int i : A) {
            if (i >= 1 && i <= N) {
                counters[i-1]++;
            } else if (i == N + 1) {
                int max = 0;
                for (int c : counters) {
                    max = c > max ? c : max;
                }
                Arrays.fill(counters, max);
            }
        }
        return counters;
    }

    public static int[] solution3(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);
        for (int i : A) {
            if (i >= 1 && i <= N) {
                counters[i-1]++;
            } else {
                int max = 0;
                for (int c : counters) {
                    max = c > max ? c : max;
                }
                Arrays.fill(counters, max);
            }
        }
        return counters;
    }

    public static int[] solution4(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);
        for (int i : A) {
            if (i >= 1 && i <= N) {
                counters[i-1]++;
            } else {
                int[] copy = Arrays.copyOf(counters, counters.length);
                Arrays.sort(copy);
                Arrays.fill(counters, copy[copy.length-1]);
            }
        }
        return counters;
    }
}
