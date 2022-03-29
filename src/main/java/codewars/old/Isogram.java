package codewars.old;

public class Isogram {


    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("moose"));
        System.out.println(isIsogram("isIsogram"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
        System.out.println(isIsogram("thumbscrewjapingly"));
        System.out.println(isIsogram(""));
    }

    public static boolean isIsogram(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(Character.toString(str.toLowerCase().charAt(i)))) {
                unique += str.toLowerCase().charAt(i);
            } else {
                return false;
            }
        }
        return true;
    }
}
