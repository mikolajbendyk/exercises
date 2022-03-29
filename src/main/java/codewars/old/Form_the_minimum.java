package codewars.old;

import java.util.Arrays;

public class Form_the_minimum {

    public static void main(String[] args) {
        System.out.println(minValue(new int[] {1,3,1}));                     // assertEquals(13,
        System.out.println(minValue(new int[] {4, 7, 5, 7}));                // assertEquals(457,
        System.out.println(minValue(new int[] {4, 8, 1, 4}));                // assertEquals(148,
        System.out.println(minValue(new int[] {5, 7, 9, 5, 7}));             // assertEquals(579,
        System.out.println(minValue(new int[] {6, 7, 8, 7, 6, 6}));          // assertEquals(678,
    }

    public static int minValue(int[] values){
        int[] distincts = new int[0];
        for (int i : values) {
            boolean distinct = true;
            for (int j : distincts) {
                if (i == j) {
                    distinct = false;
                }
            }
            if (distinct) {
                distincts = Arrays.copyOf(distincts, distincts.length+1);
                distincts[distincts.length-1] = i;
            }
        }
        Arrays.sort(distincts);
        String result = "";
        for (int d : distincts) {result += d;};
        return Integer.parseInt(result);
    }
}
