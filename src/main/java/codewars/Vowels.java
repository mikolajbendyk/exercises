package codewars;

public class Vowels {

    public static void main(String[] args) {
        System.out.println(getCount("jabudabu"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] input = str.toCharArray();
        for (int i=0; i<input.length; i++) {
            for (int j=0; j<vowels.length; j++) {
                if (input[i] == vowels[j]) {
                    vowelsCount++;
                    break;
                }
            }
        }
        return vowelsCount;
    }
}
