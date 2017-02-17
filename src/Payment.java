import java.util.*;

public class Payment {
    static Scanner scan = new Scanner(System.in);

    //Prompts for cash given vs cash owed and calculates difference
    public static double cashGoingIn(double total) {
        double cashChanged = Validator.getDouble(scan, "Enter amount of cash given: ");
        double cashOut = cashChanged - total;
        Validator.userExit(scan, "Press ENTER to Commit Transaction");
        System.out.printf("Change owed: $ %5.2f ", cashOut);
        return cashOut;
    }
    //Prompts for the user's check number
    public static void checkGoingIn(double total) {
        Validator.getCheckNum(scan, "Enter check number: ");
        Validator.userExit(scan, "Press ENTER to Commit Transaction");
    }
    //Prompts for the user's Credit Card Info
    public static String creditInfo() {
        Boolean complete = true;
        String enterCardNum = " ";
        while (complete) {
            enterCardNum = Validator.getCardNum(scan, "Enter Card Number: ");
            Validator.isDate(scan, "Enter Date MMDD format: ");
            Validator.isCVV(scan, "Enter CVV num ### format: ");
            Validator.userExit(scan,"Press ENTER to Commit Transaction");
                break;
            }return enterCardNum;
        }
    //Calculates the tax to the subtotal.
    public static double calculateTax(double subtotal) {

        double tax = 0;

        tax = subtotal * .06;
        return tax;
    }
    //Calculates the subtotal + tax = total
    public static double calculateTotal(double sum) {
        double total = 0;
        total = sum * 1.06;
        return total;
    }

}