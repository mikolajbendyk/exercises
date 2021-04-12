package codility.samsung;

import java.util.Arrays;

public class task2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5)));
        System.out.println(Arrays.toString(solution(4)));
        System.out.println(Arrays.toString(solution(1)));
    }

    public static int[] solution(int N) {
        int[] arr = new int[N];

        if (N % 2 != 0) {
            arr[0] = 0;
            if (N == 1) {
                return arr;
            }
            for (int i = 1; i < N; i += 2) {
                arr[i] = i;
                arr[i+1] = -i;
            }
        } else {
            for (int i = 0; i < N; i += 2) {
                arr[i] = i+1;
                arr[i+1] = -(i+1);
            }
        }
        return arr;
    }
}
