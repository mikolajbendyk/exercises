package codewars.old;

import java.util.Arrays;

public class Supermarket_queue {

    public static void main(String[] args) {

    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] distro = new int[n];
        if (customers.length > 0) {
            for (int i = 0; i < n; i++) {
                distro[i] += customers[i];
            }
            for (int j = n; j < customers.length; j++) {
                Arrays.sort(distro);
                distro[0] += customers[j];
            }
            Arrays.sort(distro);
            return distro[distro.length - 1];
        } else {
            return 0;
        }
    }
}
