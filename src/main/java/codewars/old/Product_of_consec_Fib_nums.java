package codewars.old;

import java.util.Arrays;

public class Product_of_consec_Fib_nums {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(productFib(273)));
        System.out.println(Arrays.toString(productFib(4895)));
//        System.out.println(Arrays.toString(productFib(152312895)));
    }

    public static long[] productFib(long prod) {
        int[] fibNums = {0, 1};
        int y = (int) (Math.sqrt(prod / 1.7) / 4.8);
        while (fibNums.length < y) {
            fibNums = addNums(fibNums);
        }
        while (true) {
            int num1 = fibNums[fibNums.length - 2];
            int num2 = fibNums[fibNums.length - 1];
            if (num1 * num2 == prod) {
                return new long[]{num1, num2, 1};
            } else if (num1 * num2 > prod) {
                return new long[]{num1, num2, 0};
            } else {
                fibNums = addNums(fibNums);
            }
        }
    }

    public static int[] addNums(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = arr[arr.length - 3] + arr[arr.length - 2];
        return arr;
    }


//    public static long[] productFib(long prod) {
//        int[] fibNums = {0,1};
//        double x = Math.sqrt(prod/1.7);
//        while (true) {
//            if (fibNums[0] < x) {
//                fibNums[1] = fibNums[0] + fibNums[1];
//                fibNums[0] = fibNums[1] - fibNums[0];
//            } else {
//                if (fibNums[0] * fibNums[1] == prod) {
//                    return new long[]{fibNums[0], fibNums[1], 1};
//                } else if (fibNums[0] * fibNums[1] > prod) {
//                    return new long[]{fibNums[0], fibNums[1], 0};
//                } else {
//                    fibNums[1] = fibNums[0] + fibNums[1];
//                    fibNums[0] = fibNums[1] - fibNums[0];
//                }
//            }
//        }
}