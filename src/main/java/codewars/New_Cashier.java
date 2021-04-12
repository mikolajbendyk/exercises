package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class New_Cashier {

    public static void main(String[] args) {
//        System.out.println(getOrder("kanapka"));
        System.out.println(getOrderMap("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza")); //("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", Solution.
//        System.out.println(getOrder("pizzachickenfriesburgercokemilkshakefriessandwich")); //("Burger Fries Fries Chicken Pizza Sandwich Milkshake Coke", Solution.
//        getOrderMap("xx");
    }

    public static String getOrderMap(String input) {
        String menuString = "Burger Fries Chicken Pizza Sandwich Onionrings Milkshake Coke";
        Map<Integer, String> numbersKeys = new HashMap<>();
        String[] menuArr = menuString.split(" ");
        for (int i=0; i<menuArr.length; i++) {
            numbersKeys.put(i+1, menuArr[i]);
        }
        Map<String, Integer> itemsKeys = new HashMap<>();
        for (int i=0; i<menuArr.length; i++) {
            itemsKeys.put(menuArr[i], i+1);
        }
        String[] menuArrLower = menuString.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder(input);
        int[] orderIds = new int[0];
        for (int i=4; i<=sb.length(); i++) {
            String sub = sb.substring(0, i);
            for (int j=0; j<menuArrLower.length; j++) {
                if (String.valueOf(sub).equals(menuArrLower[j])) {
                    sb.delete(0, i);
                    sub = Character.toUpperCase(sub.charAt(0)) + sub.substring(1);
                    orderIds = addOrder(orderIds, itemsKeys.get(sub));
                    i = 3;
                }
            }
        }
        String result = "";
        Arrays.sort(orderIds);
        for (int i : orderIds) {
            result += numbersKeys.get(i) + " ";
        }
        return result.trim();
    }

    public static int[] addOrder(int[] orderIds, int id) {
        orderIds = Arrays.copyOf(orderIds, orderIds.length+1);
        orderIds[orderIds.length-1] = id;
        return orderIds;
    }

//    public static String getOrder(String input) {
//        String orderFinal = "";
//        String[] orderArr = new String[0];
//        String menu = "Burger Fries Chicken Pizza Sandwich Onionrings Milkshake Coke";
//        String[] menuArr = menu.split(" ");
//        String[] menuArrLower = menu.toLowerCase().split(" ");
//        StringBuilder sb = new StringBuilder(input);
//        for (int i=4; i<sb.length(); i++) {
//            String sub = sb.substring(0, i);
//            for (int j=0; j<menuArrLower.length; j++) {
//                if (String.valueOf(sub).equals(menuArrLower[j])) {
//                    sb.delete(0, i);
//                    orderArr = addOrder(orderArr, menuArr[j]);
//                    i = 3;
//                    break;
//                }
//            }
//        }
//        Arrays.sort(orderArr);
//        for (String item : orderArr) {
//            orderFinal += item + " ";
//        }
//        return orderFinal.trim();
//    }



}
