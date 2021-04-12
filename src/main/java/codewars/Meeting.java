package codewars;

import java.util.Arrays;

public class Meeting {

    public static void main(String[] args) {
        String[] s = {"(TORNBULL, BARNEY)","(CORWILL, ALFRED)","(CORWILL, RAPHAEL)","(TORNBULL, BETTY)","(CORWILL, FRED)"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
    }

    public static String meeting(String s) {
        String[] oldNamesArr = s.toUpperCase().split(";");
        String[] newNamesArr = new String[oldNamesArr.length];
        for (int i=0; i< oldNamesArr.length; i++) {
            String[] nameArr = oldNamesArr[i].split(":");
            String newName = "(" + nameArr[1] + ", " + nameArr[0] + ")";
            newNamesArr[i] = newName;
        }
        String result = "";
        Arrays.sort(newNamesArr);
        for (String n : newNamesArr) {
            result += n;
        }
        return result;
    }
}
