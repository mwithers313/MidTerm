import java.util.*;
public class Credit {
    static Scanner scan = new Scanner(System.in);

    /**
     * Ask user for:
     * credit card Number
     * validation correct numbers based on 16 digits
     * Expiration Date
     * validate date based on 4 digits
     * CVV number
     * validate integers based on 3 digits
     * Send payment?(y/n)
     * validate is y or no
     * send to receipt class
     */
    public static double creditInfo() {

        do {
            int enterCardNumber = Validator.getInt(scan, "Enter Credit Card Number: ", 16);
            int enterDate = Validator.getInt(scan, "Enter Date: ");
            

        }

    }
}