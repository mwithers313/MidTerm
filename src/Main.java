import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void writeTextToFile(String fileName, String Input) {


        Path filePath = Paths.get(fileName);

        File productsFile = filePath.toFile();


        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(productsFile, true));

            out.print(Input);

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

    public static void main(String[] args) {
        writeTextToFile("ProductList", "Product: Bananas\tCategory: Fruit\t \nChicken\nAvocado\nGround Turkey\nBread\nCereal\nMilk\nOrange Juice\nCheese\nOatmeal\nM&M's\nDoughnut\nCream Cheese"); //this adds the original items to the list

        ArrayList<Product> foodList = new ArrayList<Product>();


        foodList.add(

        try {
            FileOutputStream fos = new FileOutputStream("ProductList");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(foodList); // write MenuArray to ObjectOutputStream
            oos.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
