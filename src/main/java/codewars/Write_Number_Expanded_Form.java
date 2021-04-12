package codewars;

public class Write_Number_Expanded_Form {

    public static void main(String[] args) {
        System.out.println(expandedForm2(12));
        System.out.println(expandedForm2(42));
        System.out.println(expandedForm2(70304));
        System.out.println(expandedForm2(7000000));
    }

    //cudze rozwiązanie z coderslab
    public static String expandedForm2(int num)
    {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;

        return outs;
    }

    public static String expandedForm(int num) {
        String number = String.valueOf(num);
        String result = "";
        for (int i = 0; i < number.length(); i++) {
            if (Character.getNumericValue(number.charAt(i)) != 0) {
                result += number.charAt(i);
                int l = number.length() - (i + 1);
                for (int j = 0; j < l; j++) {
                    result += "0";
                }
                if (addPlus(number, i)) {
                    result += " + ";
                }
            }
        }
        return result;
    }

    public static boolean addPlus(String number, int ind) {
        String part = number.substring(ind+1);
        for (int i=0; i<part.length(); i++) {
            if (Character.getNumericValue(part.charAt(i)) != 0) {
                return true;
            }
        }
        return false;
    }
}
