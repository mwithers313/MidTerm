import java.util.*;

public class Cash {
    static Scanner scan = new Scanner(System.in);

    /**
     * Ask user for:
     * amount tender received
     * validate user entered dollar amount
     * tender received - total
     * Cash in? (y/n)
     * print out cash to be changed to customer
     * send to receipt class
     */
    public static double cashGoingin() {
        double cashChanged = Validator.getDouble(scan, "Enter amount of cash given: ");
        double cashOut = cashChanged - Payment.total.;
        Boolean transactionCommit = Validator.userExit(scan, "Press ENTER to Commit Transaction");
        return cashOut;
    }
}
