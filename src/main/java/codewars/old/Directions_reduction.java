package codewars.old;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Directions_reduction {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc(new String[]{ "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" })));
    }

    public static String[] dirReduc(String[] arr) {
        String[] result = arr.clone();
        while (true) {
            int counter = 0;
            for (int i=0; i<result.length-1; i++) {
                if (result[i].equals("NORTH") && result[i+1].equals("SOUTH")) {
                    result = ArrayUtils.remove(result, i);
                    result = ArrayUtils.remove(result, i);
                    counter++;
                } else if (result[i].equals("SOUTH") && result[i+1].equals("NORTH")) {
                    result = ArrayUtils.remove(result, i);
                    result = ArrayUtils.remove(result, i);
                    counter++;
                } else if (result[i].equals("WEST") && result[i+1].equals("EAST")) {
                    result = ArrayUtils.remove(result, i);
                    result = ArrayUtils.remove(result, i);
                    counter++;
                } else if (result[i].equals("EAST") && result[i+1].equals("WEST")) {
                    result = ArrayUtils.remove(result, i);
                    result = ArrayUtils.remove(result, i);
                    counter++;
                }
            }
            if (counter == 0) {
                return result;
            }
        }

//        return result;

    }
}
