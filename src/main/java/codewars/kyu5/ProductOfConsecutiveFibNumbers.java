package codewars.kyu5;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.MILLIS;;

public class ProductOfConsecutiveFibNumbers {

    public static void main(String[] args) {
        LocalTime before = LocalTime.now();
        long[] result = productFib2(5895);
        LocalTime after = LocalTime.now();
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
        System.out.println(MILLIS.between(before, after));
    }

    public static long[] productFib(long prod) {
        int firstNum = 0;
        int secondNum = 1;

        while (true) {
            if (firstNum * secondNum == prod) {
                return new long[] { firstNum, secondNum, 1 };
            }
            if (firstNum * secondNum > prod) {
                return new long[] { firstNum, secondNum, 0 };
            }
            secondNum = firstNum + secondNum;
            firstNum = secondNum - firstNum;
        }
    }

    public static long[] productFib2(long prod) {
        int firstNum = 0;
        int secondNum = 1;

        while (firstNum * secondNum < prod) {
            secondNum = firstNum + secondNum;
            firstNum = secondNum - firstNum;
        }

        if (firstNum * secondNum == prod) {
            return new long[] { firstNum, secondNum, 1 };
        }
        if (firstNum * secondNum > prod) {
            return new long[] { firstNum, secondNum, 0 };
        }

        return new long[]{};

    }

}
