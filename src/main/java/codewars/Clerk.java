package codewars;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Clerk {

    public static void main(String[] args) {

        System.out.println(tickets(new int[] {25, 25, 50})); // => YES
        System.out.println(tickets(new int[] {25, 100})); // => NO. Vasya will not have enough money to give change to 100 dollars
        System.out.println(tickets(new int[] {25, 25, 50, 50, 100})); // => NO. Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50)

    }

    public static String tickets(int[] peopleInLine)
    {
        int[] cash = new int[0];
        for (int i : peopleInLine) {
            switch (i) {
                case 25:
                    cash = addToArr(cash, i);
                    break;
                case 50:
                    if (containsBill(cash, 25, 1)) {
                        cash = addToArr(cash, i);
                        cash = removeFromArr(cash, 25, 1);
                    } else {
                        return "NO";
                    }
                    break;
                case 100:
                    if (containsBill(cash, 50, 1) && containsBill(cash, 25, 1)) {
                        cash = addToArr(cash, i);
                        cash = removeFromArr(cash, 50, 1);
                        cash = removeFromArr(cash, 25, 1);
                    } else if (containsBill(cash, 25, 3)) {
                        cash = addToArr(cash, i);
                        cash = removeFromArr(cash, 25, 3);
                    }
                    else {
                        return "NO";
                    }
                    break;
            }
        } return "YES";
    }

    public static int[] addToArr(int[] arr, int n) {
        arr = Arrays.copyOf(arr, arr.length+1);
        arr[arr.length-1] = n;
        return arr;
    }

    public static int[] removeFromArr(int[] arr, int n, int l) {
        int counter = 0;
        int[] tempArr = arr.clone();
        for (int i=0; i<tempArr.length; i++) {
            if (arr[i] == n) {
                tempArr = ArrayUtils.remove(tempArr, i);
                counter++;
            }
            if (counter == l) {
                return tempArr;
            }
        }
        return arr;
    }

    public static boolean containsBill(int[] arr, int n, int l) {
        int counter = 0;
        for (int i : arr) {
            if (i == n) {
                counter++;
            }
            if (counter == l) {
                return true;
            }
        }
        return false;
    }
}
