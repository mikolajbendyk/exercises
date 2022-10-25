package codility.lessons;

public class count {
    
    public static void main(String[] args) {
        print(solution2(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

    private static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        int Nplus = N + 1;
        boolean updToMax = true;

        for (int i : A) {
            if (i >= 1 && i <= N) {
                counters[i - 1]++;
                if (counters[i - 1] > max) {
                    max = counters[i - 1];
                    updToMax = false;
                }
            } else if (i == Nplus && !updToMax) {
                for (int j = 0; j < counters.length; j++) {
                    counters[j] = max;
                }
                updToMax = true;
            }
        }

        return counters;
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }

    private static int[] solution2(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        int Nplus = N + 1;
        int maxToUpd = 0;

        for (int i : A) {
            int index = i - 1;
            if (i >= 1 && i <= N) {
                if (counters[index] < max) {
                    counters[index] = max + 1;
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
}
