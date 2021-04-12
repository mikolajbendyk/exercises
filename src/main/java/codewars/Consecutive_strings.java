package codewars;

public class Consecutive_strings {

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2)); //"abigailtheta";
        System.out.println(longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));// "oocccffuucccjjjkkkjyyyeehh");
        System.out.println(longestConsec(new String[] {}, 3));// "";
    }

    public static String longestConsec(String[] strarr, int k) {
        String result = "";
        int l = strarr.length;
        if (l == 0 || k > l || k <= 0) {
            return result;
        }
        for (int i=0; i<(l-k+1); i++) {
            String temp = "";
            for (int j=0; j<k; j++) {
                temp += strarr[i+j];
                if (temp.length() > result.length()) {
                    result = temp;
                }
            }
        }
        return result;
    }
}
