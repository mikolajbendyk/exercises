package codewars.kyu6;

public class SimpleTransposition {

    public static void main(String[] args) {
        System.out.print(2 % 2);
    }

    public static String simpleTransposition(String text) {
        StringBuilder firstRowBuilder = new StringBuilder(new String());
        StringBuilder secondRowBuilder = new StringBuilder(new String());

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                firstRowBuilder.append(text.charAt(i));
            } else {
                secondRowBuilder.append(text.charAt(i));
            }
        }

        return firstRowBuilder.append(secondRowBuilder).toString();
    }

    public static String simpleTransposition2(String text) {
        String firstRow = "";
        String secondRow = "";

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                firstRow = firstRow + text.charAt(i);
            } else {
                secondRow = secondRow + text.charAt(i);
            }
        }

        return firstRow + secondRow;
    }

}
