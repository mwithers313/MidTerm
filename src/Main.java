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
            PrintWriter out = new PrintWriter(new FileOutputStream(productsFile, true));
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







    public static ArrayList<Product> findCategory(String input, ArrayList<Product> productArrayList) {
        ArrayList<Product> ProductByItemNumber = new ArrayList<Product>();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (input.equalsIgnoreCase(productArrayList.get(i).getItemNumber())) {
                ProductByItemNumber.add(productArrayList.get(i));
            }}
        return ProductByItemNumber;
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


        boolean anotherPurchase = true;
        while (anotherPurchase) {
            System.out.println("Please select the item number you would like to purchase?:");

            String itemSelected = scan.next();

            System.out.println("How many would you like to purchase?");

            int amountPurchased = scan.nextInt();

            String item = "";

            System.out.println(findCategory(itemSelected, productArrayList));

            anotherPurchase = anotherItem();


        foodList.add()


        }


    }

}











