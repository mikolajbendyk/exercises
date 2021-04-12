package codewars;

public class Century_from_year {

    public static void main(String[] args) {
        System.out.println(century(1900));
    }

    public static int century(int number) {
        char[] digits = String.valueOf(number).toCharArray();
        int result = 0;
        if (digits.length < 3) {
            result = 1;
        } else if (digits.length == 3) {
            if (Character.getNumericValue(digits[digits.length - 1]) == 0 && Character.getNumericValue(digits[digits.length - 2]) == 0) {
                result = Integer.parseInt(Character.toString(digits[0]));
            } else {
                result = Integer.parseInt(Character.toString(digits[0])) + 1;
            }
        } else {
            if (Character.getNumericValue(digits[digits.length - 1]) == 0 && Character.getNumericValue(digits[digits.length - 2]) == 0) {
                result = Integer.parseInt(Character.toString(digits[0]) + Character.toString(digits[1]));
            } else {
                result = Integer.parseInt(Character.toString(digits[0]) + Character.toString(digits[1])) + 1;
            }
        }
        return result;
    }
}