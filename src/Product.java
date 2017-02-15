import java.util.ArrayList;

/**
 * Created by Michael on 2/15/2017.
 */
public class Product {

    private String name;
    private String category;
    private String description;
    private double price;
    private String itemNumber;


    public Product(String itemNumber, String name, String category, String description, double price) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;

    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {

        return name + "\t" + category + "\t" + description + "\t" + price;

    }
}

