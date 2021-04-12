package codewars;

import java.util.Arrays;

public class Stray_number {

    public static void main(String[] args) {
        System.out.println(stray(new int[]{4,7,2}));
    }

    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return (numbers[0] != numbers[1]) ? numbers[0] : numbers[numbers.length-1];
    }
}


//if (numbers[0] != numbers[1]) {
//            return numbers[0];
//        } else {
//            return numbers[numbers.length-1];
//        }