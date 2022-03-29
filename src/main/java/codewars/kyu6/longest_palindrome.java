package codewars.kyu6;

public class longest_palindrome {

    public static void main(String[] args) {
        // System.out.println(longestPalindrome("baablkj12345432133d"));
        // System.out.println(longestPalindrome("12345432133d"));
        System.out.println(longestPalindrome("aa"));
    }
    
    public static int longestPalindrome(final String s) {

        if (s.length() == 0) {
            return 0;
        }
        
        int max = 1;

        for (int i=0; i <= s.length(); i++) {
            for (int j=s.length(); j > i; j--) {
                StringBuilder sb = new StringBuilder(s.substring(i, j));
                if (sb.toString().equals(sb.reverse().toString())) {
                    max = max < sb.length() ? sb.length() : max;
                    break;
                }
            }
            if (max >= s.length()-i) {
                return max;
            }
        }

        return max;

        // for (int i=0; i <= s.length()/2; i++) {
        //     for (int j=0; j > i; j--) {
        //         if (s.charAt(i) == s.charAt(j)) {
        //             jIndex = jIndex == 0 ? j : jIndex;
        //             break;
        //         }
        //         jIndex = 0;
        //     }
        // }

    }


}
