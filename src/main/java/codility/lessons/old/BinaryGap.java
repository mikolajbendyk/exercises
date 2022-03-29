package codility.lessons.old;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    public static void main(String[] args) {

//        System.out.println(solution(8));
//        System.out.println(solution(42));
//        System.out.println(solution(32));
//        System.out.println(solution(1041));
        System.out.println(solution(20415434));

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
}
