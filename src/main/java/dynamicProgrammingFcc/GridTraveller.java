package dynamicProgrammingFcc;

import java.util.HashMap;

public class GridTraveller {
    
    public static void main(String[] args) {
        // System.out.println(traveller(2, 3));
        // System.out.println(traveller(3, 2));
        // System.out.println(traveller(3, 3));
        // System.out.println(traveller(1, 1));
        // System.out.println(traveller(18, 18));

        System.out.println(travellerMem(2, 3, new HashMap<>()));
        System.out.println(travellerMem(3, 2, new HashMap<>()));
        System.out.println(travellerMem(3, 3, new HashMap<>()));
        System.out.println(travellerMem(1, 1, new HashMap<>()));
        System.out.println(travellerMem(18, 18, new HashMap<>()));
    }

    private static long traveller(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        return traveller(m - 1, n) + traveller(m, n - 1);
    }

    private static long travellerMem(int m, int n, HashMap<String, Long> mem) {
        String key = m + "," + n;
        if (mem.containsKey(key)) {
            return mem.get(key);
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }
        mem.put(key, travellerMem(m - 1, n, mem) + travellerMem(m, n - 1, mem));
        return mem.get(key);
    }
}