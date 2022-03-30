package codewars.kyu6;

public class takeTenMinutesWalk {

    public static void main(String[] args) {

        isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'});

    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int h = 0;
        int w = 0;

        for (char c : walk) {
            switch (c) {
                case 'n':
                    h++;
                    break;
                case 's':
                    h--;
                    break;
                case 'e':
                    w++;
                    break;
                case 'w':
                    w--;
                    break;
            }
        }
        return h == 0 && w == 0;
    }

}

