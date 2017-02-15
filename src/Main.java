import sun.misc.JavaSecurityProtectionDomainAccess;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void newTextTofile(String fileName, String Input) { //this method is a write text to file method but append is FALSE (
        Path filePath = Paths.get(fileName); //step number 1. Start with a path
        File productsFile = filePath.toFile(); //step number 2. Create a file path
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(productsFile, false));
            out.print(Input);
            out.close(); // this is how we close
        } catch (FileNotFoundException ex) {
        }
    }


    public static void writeTextToFile(String fileName, ArrayList<Product> productArrayList) {
        Path filePath = Paths.get(fileName);
        File productsFile = filePath.toFile();
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(productsFile, true));
            out.print(productArrayList);
            out.close();
        } catch (FileNotFoundException ex) {
        }
    }


    public static StringBuilder readTextFromFile(String fileName) {
        Path filePath = Paths.get(fileName);
        File productsFile = filePath.toFile();
        StringBuilder result = new StringBuilder();
        try {
            FileReader r = new FileReader(productsFile);
            BufferedReader reader = new BufferedReader(r);
            String line = reader.readLine();
            while (line != null) {
                result.append(line + "\n");
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






    public static boolean anotherItem() { //play again loop method
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





    public static ArrayList<subTotal> printSubTotal() {
        Scanner scan = new Scanner(System.in);

        ArrayList<subTotal> subTotalArrayList = new ArrayList<subTotal>();

        boolean anotherPurchase = true;
        while (anotherPurchase) {
            System.out.println("Please select the item number you would like to purchase?:");

            int input = scan.nextInt();

            if (input == 1) {
                System.out.println("How many Bananas would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Bananas", subtotal));

            } else if (input == 2) {
                System.out.println("How many Chickens would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Chicken", subtotal));

            } else if (input == 3) {
                System.out.println("How many Avocado would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Avocado", subtotal));

            } else if (input == 4) {
                System.out.println("How many Ground Turkey would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Ground Turkey", subtotal));

            } else if (input == 5) {
                System.out.println("How many Wheat Bread would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Wheat Bread", subtotal));

            } else if (input == 6) {
                System.out.println("How many Cereal would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Cereal", subtotal));

            } else if (input == 7) {
                System.out.println("How many Cheese would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Cheese", subtotal));

            } else if (input == 8) {
                System.out.println("How many Oatmeal would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Oatmeal", subtotal));

            } else if (input == 9) {
                System.out.println("How many M&M's would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("M&M's", subtotal));

            } else if (input == 10) {
                System.out.println("How many Milk would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Milk", subtotal));

            } else if (input == 11) {
                System.out.println("How many Steak would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Steak", subtotal));

            } else if (input == 12) {
                System.out.println("How many Noodles would you like to purchase?: ");
                int purchaseAmount = scan.nextInt();

                double subtotal = (purchaseAmount * 2.00);

                subTotalArrayList.add(new subTotal("Noodles", subtotal));

            } else {
                System.out.println("Please make a valid entry");
            }

            anotherPurchase = anotherItem();
        }
        return subTotalArrayList;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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


        System.out.println("1. Banana\n" + "2. Chicken\n" + "3. Avocado\n" + "4. Ground Turkey\n" + "5. Wheat Bead\n" +
                "6. Cereal\n" + "7. Cheese\n" + "8. Oatmeal\n" + "10. Milk\n" + "11. Steak\n" + "12. Noodles\n");

        //we need to add category, description, and price


        ArrayList<subTotal> subTotalArrayList = printSubTotal(); //this is our new ArrayList with the products and prices

        System.out.println(subTotalArrayList);

        int i = 0;
        double sum = 0;
        for (i = 0; i < subTotalArrayList.size(); i++)

            sum = sum + subTotalArrayList.get(i).getPrice();


        System.out.println(sum);

        //ok guys. Sum is a double and when you run the program you can see how everything works.
        //Sum is the total amount of money they will spend before tax. BOOM.


    }

}













