package codility.lessons;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    public static void main(String[] args) {

//        System.out.println(solution(8));
//        System.out.println(solution(42));
//        System.out.println(solution(32));
       System.out.println(solutionJavaStart2(1041));
        // System.out.println(solution(20415434));

    }

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.println(binary);
        List<Integer> indexes = new ArrayList<>();

        for (int i=0; i<binary.length(); i++) {
            if (Character.getNumericValue(binary.charAt(i)) == 1) {
                indexes.add(i);
            }
        }

        if (indexes.size() < 2) {
            return 0;
        } else {
            int result = 0;
            for (int i=1; i<indexes.size(); i++) {
                int diff = indexes.get(i) - indexes.get(i-1);
                result = diff > result ? diff : result;
            }
            return result-1;
        }
    }

    public static int solution2(int N) {
        String binary = Integer.toBinaryString(N);

        int result = 0;
        for (int i = 0; i < binary.length() - 2; i++) {
            if (binary.charAt(i) == '1' && binary.charAt(i + 1) == '0') {
                for (int j = i + 2; j < binary.length(); j++) {
                    if (binary.charAt(j) == '1') {
                        int newResult = j - i - 1;
                        result = newResult > result ? newResult : result;
                        break;
                    }
                }
            }
        }
        return result;

        // return findLongest(arr);
    }

    // private static int findLongest(char[] arr) {
    //     int result = 0;
    //     for (int i = 0; i < arr.length - 2; i++) {
    //         if (arr[i] == '1' && arr[i + 1] == '0') {
    //             for (int j = i + 2; j < arr.length; j++) {
    //                 if (arr[j] == '1') {
    //                     int newResult = j - i - 1;
    //                     result = newResult > result ? newResult : result;
    //                     break;
    //                 }
    //             }
    //         }
    //     }
    //     return result;
    // }

    private static int solutionJavaStart(int N) {
        String binary = Integer.toBinaryString(N);

        int modifier = 1;
        if (binary.endsWith("1")) modifier = 0;

        String[] split = binary.split("1");

        int result = 0;

        for (int i = 0; i < split.length - modifier; i++) {
            int l = split[i].length();
            if (l > result) result = l;
        }

        return result;
    }

    private static int solutionJavaStart2(int N) {
        int pow = 0;

        while (true) {
            if (Math.pow(2, pow) > N) break;
            pow++;
        }
        pow--;

        int maxGap = 0;
        int gap = 0;
        int numberLeft = N;

        while (numberLeft > 0) {
            int x = (int) Math.pow(2, pow);
            if (numberLeft >= x) {
                numberLeft = numberLeft - x;
                if (gap > maxGap) {
                    maxGap = gap;
                }
                gap = 0;
            } else {
                gap++;
            }
            pow--;
        }

        return maxGap;
    }

    // x x x x x
    //   1 0 0 1
    // 2^4 = 16
    // 16 - 9 = 7
}
