import java.util.Scanner;

public class Validator {
    public static Boolean userExit(Scanner scan, String prompt) {
        System.out.print(prompt);
        String s = scan.nextLine();
        if (s.isEmpty()) {
            return true;
        } else {
            System.out.println("Press ENTER to commit transaction: ");
            return false;
        }
    }

    public static void getCheckNum(Scanner sc, String prompt) {
        System.out.println(prompt);
        String isCheckNum = sc.nextLine();
        boolean isValid = false;
        while (!isValid == false) {
            if (isCheckNum.length() < 8 || isCheckNum.length() > 8) {
                System.out.println("ERROR! Must be 8 digits");
            } else {
                isValid = true;
            }
            sc.nextLine();
        }
    }

    public static void isDate(Scanner sc, String prompt) {
        System.out.println(prompt);
        String isDate = sc.nextLine();
        boolean isValid = false;
        while (!isValid == false) {
            if (isDate.length() < 4 || isDate.length() > 4) {
                System.out.println("ERROR! Must be 4 digits. Try again!");

            } else {
                isValid = true;
            }
        }
    }

    public static void isCVV(Scanner sc, String prompt) {
        System.out.println(prompt);
        String cvvNum = sc.nextLine();
        boolean isValid = false;
        while (!isValid == false) {
            if (cvvNum.length() < 3 || cvvNum.length() > 3) {
                System.out.println("ERROR! Must be 3 digits. Try again!");
            } else {
                isValid = true;
            }
        }
    }

    public static String getCardNum(Scanner sc, String prompt) {
        System.out.print(prompt);
        String creditNum = sc.nextLine();
        boolean isValid = false;
        while (!isValid == false) {
            if (creditNum.length() < 16) {
                System.out.println("ERROR! Must be 16 digits.");
                for (int a = 0; a < creditNum.length(); a++) {
                    if (!Character.isDigit(creditNum.charAt(a))) {
                        System.out.println("ERROR! Must contain all numbers. Try again!");
                    }
                }// discard any other data entered on the line
            }
        }
        return creditNum;
    }

    public static double getDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

}
