package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class New_Cashier_2 {

    public static void main(String[] args) {
        System.out.println(getOrderMap("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza")); //("Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke", Solution.
    }

    public static String getOrderMap(String input) {
        String menuString = "Burger Fries Chicken Pizza Sandwich Onionrings Milkshake Coke";
        Map<Integer, String> menuMap = new HashMap<>();
        for (int i = 0, l = menuString.split(" ").length; i < l; i++) {
            menuMap.put(i + 1, menuString.split(" ")[i]);
        }
        StringBuilder sb = new StringBuilder(input);
        int[] orderIds = new int[0];
        for (int i = 4; i <= sb.length(); i++) {
            String sub = sb.substring(0, 1).toUpperCase() + sb.substring(1, i);
            for (Integer key : menuMap.keySet()) {
                if (sub.equals(menuMap.get(key))) {
                    sb.delete(0, i);
                    orderIds = addOrder(orderIds, key);
                    i = 3;
                    break;
                }
            }
        }
        String result = "";
        Arrays.sort(orderIds);
        for (int i : orderIds) {
            result += menuMap.get(i) + " ";
        }
        return result.trim();
    }

    public static int[] addOrder(int[] orderIds, int id) {
        orderIds = Arrays.copyOf(orderIds, orderIds.length + 1);
        orderIds[orderIds.length - 1] = id;
        return orderIds;
    }
}