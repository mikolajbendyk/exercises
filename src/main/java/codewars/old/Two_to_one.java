package codewars.old;

import java.util.Arrays;

public class Two_to_one {

    public static void main(String[] args) {

    }

    public static String longest (String s1, String s2) {
        String sum = s1 + s2;
        String result = "";
        for (int i=0; i<sum.length(); i++) {
            if (!result.contains(String.valueOf(sum.charAt(i)))) {
                result += sum.charAt(i);
            }
        }
        char[] chars = result.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
