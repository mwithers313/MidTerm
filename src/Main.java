import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.*;

public class Main {
    //Writes arraylist to file
    public static void writeTextToFile(String fileName, ArrayList<Product> productArrayList) {
        Path filePath = Paths.get(fileName);
        File productsFile = filePath.toFile();
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(productsFile, false));
            out.print(productArrayList);
            out.close();
        } catch (FileNotFoundException ex) {
        }
    }

    //Reads the ArrayList from the text file.
    public static StringBuilder readTextFromFile(String fileName) {
        Path filePath = Paths.get(fileName);
        File productsFile = filePath.toFile();
        StringBuilder result = new StringBuilder();
        try {
            FileReader r = new FileReader(productsFile);
            BufferedReader reader = new BufferedReader(r);
            String line = reader.readLine().replace("[", " ");
            while (line != null) {
                String newLine = line.replace(",", "").replace("]","");
                result.append(newLine + "\n");
                line = reader.readLine();
            }
            reader.close();
            return result;
        } catch (FileNotFoundException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        }
    }


    //Determines if the user wants to add another item to the shopping list.
    public static boolean anotherItem() {
        Scanner scnr = new Scanner(System.in);
        String userInput = "";
        char answer = '-';
        System.out.println("Another Item? (y/n):");
        userInput = scnr.next();
        answer = userInput.charAt(0);
        if ((answer == 'Y') || (answer == 'y')) {
            return true;
        } else if ((answer == 'N') || (answer == 'n')) {
        }
        return false;
    }

    //Executes the run program in Main. Contains the arraylist to write to file and the if/else
    //for user choice from Inventory list.
        public static void runPOSprogram () {

            Scanner scan = new Scanner(System.in);

            int paymentMethod = 0;
            String enterCardNum = " ";
            double changeReceived = 0.0;


                ArrayList<Product> productArrayList = new ArrayList<Product>();

                System.out.println("WELCOME TO THE ALL-STAR FOOD MENU!!!");

                productArrayList.add(new Product("1", "Banana", "Fruit", "Fruit", 2.00));
                productArrayList.add(new Product("2", "Chicken", "Meat", "Meat", 2.00));
                productArrayList.add(new Product("3", "Avocado", "Fruit", "Fruit", 2.00));
                productArrayList.add(new Product("4", "Ground Turkey", "Meat", "Fruit", 2.00));
                productArrayList.add(new Product("5", "Wheat Bread", "Bread", "Loaf", 2.00));
                productArrayList.add(new Product("6", "Cereal", "Breakfast", "Food", 2.00));
                productArrayList.add(new Product("7", "Cheese", "Dairy", "Dairy", 2.00));
                productArrayList.add(new Product("8", "Oatmeal", "Breakfast", "Oats", 2.00));
                productArrayList.add(new Product("9", "M&M's", "Category", "Candy", 2.00));
                productArrayList.add(new Product("10", "Milk", "Drink", "Dairy", 2.00));
                productArrayList.add(new Product("11", "Steak", "Meat", "Cow", 2.00));
                productArrayList.add(new Product("12", "Noodles", "Noodles", "Rice Noodles", 2.00));

                writeTextToFile("ProductList.txt", productArrayList);


                System.out.println("Item      Name         " +
                        "   Category        Description          Price");
                System.out.println("====      =======      " +
                        "   ========        =============        =====");

                System.out.println(readTextFromFile("ProductList.txt"));

            ArrayList<subTotal> subTotalArrayList = new ArrayList<subTotal>();


            boolean anotherPurchase = true;
            while (anotherPurchase) {


                System.out.println("Please select the item number you would like to purchase?:");

                int input = scan.nextInt();

                if (input == 1) {
                    System.out.println("Bananas \nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Bananas", subtotal));

                } else if (input == 2) {
                    System.out.println("Chicken\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Chicken", subtotal));

                } else if (input == 3) {
                    System.out.println("Avocado\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Avocado", subtotal));

                } else if (input == 4) {
                    System.out.println("Ground Turkey\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Ground Turkey", subtotal));

                } else if (input == 5) {
                    System.out.println("Wheat Bread\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Wheat Bread", subtotal));

                } else if (input == 6) {
                    System.out.println("Cereal\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Cereal", subtotal));

                } else if (input == 7) {
                    System.out.println("Cheese\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Cheese", subtotal));

                } else if (input == 8) {
                    System.out.println("Oatmeal\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Oatmeal", subtotal));

                } else if (input == 9) {
                    System.out.println("M&Ms\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("M&M's", subtotal));

                } else if (input == 10) {
                    System.out.println("Milk\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Milk", subtotal));

                } else if (input == 11) {
                    System.out.println("Steak\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Steak", subtotal));

                } else if (input == 12) {
                    System.out.println("Noodles\nQuantity: ");
                    int purchaseAmount = scan.nextInt();

                    double subtotal = (purchaseAmount * 2.00);

                    subTotalArrayList.add(new subTotal("Noodles", subtotal));

                } else {
                    System.out.println("Please make a valid entry");
                }

                anotherPurchase = anotherItem(); //
            }

            System.out.println("Grocery List is: " + subTotalArrayList);

            int i = 0;
            double sum = 0;
            for (i = 0; i < subTotalArrayList.size(); i++)
                sum = sum + subTotalArrayList.get(i).getPrice();

                System.out.println("Would you like to complete this order? (y/n)");
                String input = scan.next();

                if (input.equalsIgnoreCase("y")) {


                    System.out.println("*****************************************");
                    System.out.println("    Sales Invoice Preview:");
                    System.out.printf("    Subtotal:     %5.2f \n", sum);
                    System.out.printf("         Tax:     %5.2f \n", Payment.calculateTax(sum));
                    System.out.println("         =================");
                    System.out.printf("        Total:    %5.2f \n", Payment.calculateTotal(sum));
                    System.out.println("*****************************************");


                    System.out.println("\nForm of Payment: \n1.Cash\n2.Check\n3.Credit");

                    paymentMethod = scan.nextInt();

                    if (paymentMethod == 1) {
                        changeReceived = Payment.cashGoingIn(Payment.calculateTotal(sum));
                    } else if (paymentMethod == 2) {
                        Payment.checkGoingIn(Payment.calculateTotal(sum));
                    } else if (paymentMethod == 3) {
                        enterCardNum = Payment.creditInfo();
                        System.out.println(Payment.calculateTotal(sum));
                    } else if ((paymentMethod > 3) || (paymentMethod <= 0)) {
                        System.out.println("Invalid entry");
                    }


                    System.out.println();
                    System.out.println("************************************************************");
                    System.out.println("    FINAL Sale:");
                    System.out.printf("    Subtotal:     %5.2f \n", sum);
                    System.out.printf("         Tax:     %5.2f \n", Payment.calculateTax(sum));
                    System.out.println("         =================");
                    System.out.printf("        Total:    %5.2f \n", Payment.calculateTotal(sum));
                    System.out.println("************************************************************");
                    if (paymentMethod == 1) {
                        System.out.printf("    Cash Payment - Change received %5.2f \n", changeReceived);
                    } else if (paymentMethod == 2)
                        System.out.println("    Check Payment");
                    else {
                        String printCreditCard = "XXXX-XXXX-XXXX-" + enterCardNum.substring(12, 16);
                        System.out.println("    Payment made with Credit Card Number " + printCreditCard);
                        //      System.out.println("    Payment made with Credit Card Number ");
                    }
                    System.out.println("************************************************************");

                } else if (input.equalsIgnoreCase("n")) {

                runPOSprogram();

            }

            System.out.println("Would you like to start a new order?");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("y")) {

                runPOSprogram();
            } else if (answer.equalsIgnoreCase("n")) {

                System.out.println("Goodbye");
            }

        }


        public static void main (String[]args){
            runPOSprogram();

        }
    }












