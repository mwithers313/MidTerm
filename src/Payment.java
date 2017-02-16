import java.util.*;
import java.util.concurrent.Callable;

public class Payment {
    static Scanner scan = new Scanner(System.in);


    public static double cashGoingIn(double total) {
        double cashChanged = Validator.getDouble(scan, "Enter amount of cash given: ");
        double cashOut = cashChanged - total;
        Validator.userExit(scan, "Press ENTER to Commit Transaction");
        System.out.printf("Change owed: $ %5.2f ",cashOut);
        return cashOut;
    }

    public static void checkGoingIn(double total) {
        Validator.getCheckNum(scan, "Enter check number: ");
        Validator.userExit(scan, "Press ENTER to Commit Transaction");
    }

    public static String creditInfo() {
        Boolean complete = true;
        String enterCardNum = " ";
        while (complete) {
          enterCardNum = Validator.getCardNum(scan,"Enter Card Number: ");
            Validator.isDate(scan, "Enter Date MMDD format: ");
            Validator.isCVV(scan, "Enter CVV num ### format: ");
            System.out.println("Complete Transaction? (y/n)");
            if (scan.hasNext("y")) {
                complete = false;
            }
        }
        return enterCardNum;
    }

    public static double calculateTax(double subtotal) {

        double tax = 0;

        tax = subtotal * .06;
        return tax;
    }

    public static double calculateTotal(double sum) {
        double total = 0;
        total = sum * 1.06;
        return total;
    }

}