import java.util.*;
import java.util.concurrent.Callable;

public class Payment {
    static Scanner scan = new Scanner(System.in);


    public static double cashGoingIn(double total) {
        double cashChanged = Validator.getDouble(scan, "Enter amount of cash given: ");
        double cashOut = cashChanged - total;
        Validator.userExit(scan, "Press ENTER to Commit Transaction");
        System.out.println("Change owed:  " + cashOut);
        return cashOut;
    }

    public static double checkGoingIn(double total) {
        Validator.getCheckNum(scan, "Enter check number: ");
        Validator.userExit(scan, "Press ENTER to Commit Transaction");
        return total;
    }

    public static double creditInfo(double total) {
        double cashout = total;
        Boolean complete = true;
        while (complete) {
            String enterCardNum = Validator.getCardNum(scan,"Enter Card Number: ");
            Validator.isDate(scan, "Enter Date in MMYY format: ");
            Validator.isCVV(scan, "Enter CVV num in ### format: ");
            System.out.println("Complete Transaction? (y/n)");
            if (scan.hasNext("y")) {
                complete = false;
            }
        }
        return total;
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