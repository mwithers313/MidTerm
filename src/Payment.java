import java.util.*;
import java.util.concurrent.Callable;

public class Payment {

    /**
     * Total method
     * Pulls subtotal from main
     * calculate subtotal * tax
     * spit out total amount
     * Ask for payment option
     */

    /**payment options
     * 1. Cash
     * 2. Credit
     * 3. Check
     *********/

    /**
     * payment option will pull from payment classes
     *
     */

    public static Cash cashPayment = new Cash();
    public static Check checkPayment = new Check();
    public static Credit creditPayment = new Credit();

    public static double calculateTax (double subtotal) {

        double tax = 0;

        tax = subtotal * .06;
        return tax;
    }


    public calculatePayment(double subtotal) {

        Scanner scan1 = new Scanner(System.in);
        String inputPaymentType = " ";

        System.out.println("How do you want to pay? Case / Credit / Check");
        inputPaymentType = scan1.nextLine();

        if (inputPaymentType.equalsIgnoreCase("cash") {
            Cash.cashGoingin();
        }

        else if (inputPaymentType.equalsIgnoreCase("credit") {
                Credit.();


            }
            }
        }