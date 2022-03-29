package codewars.old;

public class Playing_with_digits {

    public static void main(String[] args) {
//        float x = 89;
//        int y = 92;
//        float r = x/y;
//        System.out.println(r);


        System.out.println(digPow2(89,1));
        System.out.println(digPow2(92,2));
        System.out.println(digPow2(695,2));
        System.out.println(digPow2(46288, 3));
    }

    public static long digPow(int n, int p) {
        char[] digits = Integer.toString(n).toCharArray();
        double sumOfPowers = 0;
        for (int i=0; i<digits.length; i++) {
            sumOfPowers += Math.pow(Character.getNumericValue(digits[i]), p+i);
        }
        double d = sumOfPowers / n;
        int k = (int) sumOfPowers / n;
        if (k == d) {
            return k;
        }
        return -1;
    }

    //druga wersja, takie rozwiązanie chodziło mi po głowie na początku, ale nie wiem dlaczego w pewnym
    //momencie uznałem je za złe
    public static long digPow2(int n, int p) {
        char[] digits = Integer.toString(n).toCharArray();
        int sumOfPowers = 0;
        for (int i = 0; i < digits.length; i++) {
            sumOfPowers += Math.pow(Character.getNumericValue(digits[i]), p + i);
        }
        if (sumOfPowers % n == 0) {
            return sumOfPowers / n;
        }
        return -1;
    }
}
