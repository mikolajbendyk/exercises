package codewars.old;

public class Money {

    public static void main(String[] args) {
        System.out.println(Money.calculateYears(1000,0.05,0.18,1100)); //3
        System.out.println(Money.calculateYears(1000,0.01625,0.18,1200)); //14
        System.out.println(Money.calculateYears(1000,0.05,0.18,1000)); //0
    }

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int yearsCounter = 0;
        if (principal == desired) {
            return yearsCounter;
        }
        double asset = principal;
        while (asset < desired) {
            asset = asset + (asset * interest) - (asset * interest * tax);
            yearsCounter++;
        }
        return yearsCounter;
    }
}
