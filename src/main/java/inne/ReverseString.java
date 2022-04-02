package inne;

public class ReverseString {
    
    public static void main(String[] args) {
        System.out.println(reverseTwoArrays("abc"));
        System.out.println(reverseNoArrays("abc"));
    }

    private static String reverseTwoArrays(String s) {
        char[] input = s.toCharArray();
        char[] output = new char[input.length];

        for (int i = 0, j = input.length - 1; i < output.length; i++, j--) {
            output[i] = input[j];
        }

        return new String(output);
    }

    private static String reverseNoArrays(String s) {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }

        return result;
    }
}
