package dynamicProgrammingFcc;

import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        // System.out.println(fibForLoop(7));
        // System.out.println(fibForLoop(3));
        // System.out.println(fibForLoop(10));
        // System.out.println(fibForLoop(0));
        // System.out.println(fibForLoop(50));

        // System.out.println(fibRec(7));
        // System.out.println(fibRec(3));
        // System.out.println(fibRec(10));
        // System.out.println(fibRec(0));
        // System.out.println(fibRec(50));

        // System.out.println(fibRecMem(7, new HashMap<>()));
        // System.out.println(fibRecMem(3, new HashMap<>()));
        // System.out.println(fibRecMem(10, new HashMap<>()));
        // System.out.println(fibRecMem(0, new HashMap<>()));
        System.out.println(fibRecMem(50, new HashMap<>()));
    }


    private static long fibForLoop(long n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }

        long first = 1;
        long second = 1;
        long result = 0;

        for (int i = 2; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }

    private static long fibRec(long n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        return fibRec(n - 1) + fibRec(n - 2); 
    }

    private static long fibRecMem(long n, HashMap<Long, Long> mem) {
        if (mem.containsKey(n)) {
            return mem.get(n);
        }
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        mem.put(n, fibRecMem(n - 1, mem) + fibRecMem(n - 2, mem));
        return mem.get(n);
    }
}
