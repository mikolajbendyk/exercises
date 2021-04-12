package codewars;

public class Odd_or_even {

    public static void main(String[] args) {

    }

    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (sum % 2 == 0) ? "even" : "odd";
    }
}
