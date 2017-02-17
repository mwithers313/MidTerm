import java.util.Scanner;

public class Validator {
    public static Boolean userExit(Scanner scan, String prompt) {
        System.out.print(prompt);
        String s = scan.nextLine();
        if (s.equalsIgnoreCase("")) {
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
                continue;
            } else if(isCheckNum.length() == 8){
                isValid = true;
            }
            sc.nextLine();
        }
    }

    public static String getCardNum(Scanner sc, String prompt) {
        System.out.print(prompt);
        String creditNum = sc.nextLine();
        boolean isValid = true;
        int length = creditNum.length();
        while (isValid == true) {


            if (length == 16) {
                isValid = false;
<<<<<<< HEAD
            } else if (length < 16 || length > 16) {
=======
            } else  {
>>>>>>> Updated another loop issue
                System.out.println("ERROR! Must have 16 digits.");
                creditNum = sc.nextLine();
                length = creditNum.length();
                continue;
            }
        }
        while(isValid == true){
            for (int a = 0; a < creditNum.length(); a++) {
                if (Character.isDigit(creditNum.charAt(a))) {
                    isValid = false;
                } else {
                    System.out.println("ERROR! Must contain all numbers. Try again!");
                    creditNum = sc.nextLine();
                    creditNum.length();
                    continue;
                }
            }
        }
        return creditNum;
    }

    public static void isDate(Scanner sc, String prompt) {
        System.out.println(prompt);
        String isDate = sc.nextLine();
        boolean isValid = true;
        while (isValid == true) {
            if (isDate.length() == 4) {
                isValid = false;
            } else if (isDate.length() < 4 || isDate.length() > 4) {
                System.out.println("ERROR! Must be 4 digits. Try again!");
                isDate = sc.nextLine();
                isDate.length();
            }
        }
            while(isValid ==true){
            for(int a = 0; a<isDate.length(); a++){
                if (Character.isDigit(isDate.charAt(a))){
                    isValid = false;
                }else{
                    System.out.println("ERROR! Must contain all numbers. Try again!");
                    isDate = sc.nextLine();
                    isDate.length();
                    continue;
                }
            }
        }
    }

    public static void isCVV(Scanner sc, String prompt){
    System.out.println(prompt);
    String isCVV = sc.nextLine();
    boolean isValid = true;
    int length = isCVV.length();
        while (isValid == true) {
        if (length ==3) {
            isValid = false;
            } else if (length < 3 || length > 3) {
                System.out.println("ERROR! Must be 3 digits. Try again!");
                isCVV = sc.nextLine();
                length = isCVV.length();
                continue;
            }
        }
        while(isValid == true){
        for(int a = 0; a<isCVV.length(); a++){
            if (Character.isDigit(isCVV.charAt(a))){
                isValid = false;
            }else{
                System.out.println("ERROR! Must contain all numbers. Try again!");
                isCVV = sc.nextLine();
                isCVV.length();
                continue;
            }
        }
    }
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
