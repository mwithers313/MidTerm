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
     *send to receipt class
     */
public static double cashGoingin (){
   double cashChanged = Validator.getDouble(scan, "Enter amount of cash given: ");
   double cashOut = cashChanged - Payment.total.;
   System.out.println("Press ENTER to Commit Transaction: ");
   String transactionCommit = scan.nextLine();
   if (transactionCommit.equalsIgnoreCase("")) {
       System.out.println("Change total: " + cashOut);
       return cashOut;
   }else 
}



}
