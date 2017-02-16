import java.util.*;
import java.util.concurrent.Callable;

public class Payment {
    static Scanner scan = new Scanner(System.in);


    public static double cashGoingIn(double total) {
        double cashChanged = Validator.getDouble(scan, "Enter amount of cash given: ");
        double cashOut = cashChanged - total;
        Validator.userExit(scan, "Press ENTER to Commit Transaction");
        return cashOut;
    }

    public static double checkGoingIn(double total) {
        int checkNumber = Validator.getInt(scan, "Enter check number: ");
        Boolean transactionCommit = Validator.userExit(scan, "Press ENTER to Commit Transaction");
        return total;
    }

    public static double creditInfo(double total) {
        double cashout = total;
        Boolean complete = true;
        while (complete) {
            int enterCardNumber = Validator.getInt(scan, "Enter Credit Card Number: ", 16);

            int enterDate = Validator.isDate(scan, "Enter Date: ", 4);
            int enterCVV = Validator.isCVV(scan, "Enter CVV num: ", 3);
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

    public static double calcualteTotal(double sum) {
        double total = 0;
        total = sum * 1.06;
        return total;
    }

}
    /**public String paymentMethod(double subtotal) {

        Scanner scan1 = new Scanner(System.in);
        int inputPaymentType = 0;

        System.out.println("How do you want to pay?\n1.Cash\n 2.Credit \n3.Check");
        inputPaymentType = scan1.nextInt();

    **/